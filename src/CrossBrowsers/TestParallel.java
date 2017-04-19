package CrossBrowsers;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import java.net.*;
import java.net.MalformedURLException;
import org.testng.annotations.Parameters;
public class TestParallel
{
	WebDriver driver;
@Test
@Parameters("browser")
public void test(String browserName) throws MalformedURLException
{
	DesiredCapabilities cp=null;
	if(browserName.equalsIgnoreCase("firefox"))
	 {
		 cp=DesiredCapabilities.firefox();
		 cp.setBrowserName("firefox");
		 cp.setPlatform(Platform.WIN10);
		
	 }
	else if(browserName.equalsIgnoreCase("chrome"))
	 	{
		    System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver_2.28.exe");
		    driver=new ChromeDriver();
	 		cp=DesiredCapabilities.chrome();
	 		cp.setBrowserName("chrome");
	 		cp.setPlatform(Platform.WIN10);
	 	}
	URL url=new URL("http://10.10.126.117:4481/wd/hub");
	 	driver=new RemoteWebDriver(url,cp);
	 	driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		//driver.navigate().to("http://gmail.com");
	 	//driver.findElement(By.xpath("//input[@id='Email']")) .sendKeys("username");
	 	//driver.findElement(By.xpath("//input[@name='Passwd']")) .sendKeys("password");
	 	//driver.close();
		//driver.quit();
}
}