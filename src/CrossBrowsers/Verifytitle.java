package CrossBrowsers;
//import java.net.URL;

//import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
	//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
	//import java.net.MalformedURLException;
	
	public class Verifytitle 
	{
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void verifypagetitle(String browserName)
	{
	if(browserName.equalsIgnoreCase("firefox"))
	{
	driver=new FirefoxDriver();	
	}
	else if(browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver_2.28.exe");
	    driver=new ChromeDriver();
	    //driver.navigate().to("learn-automation.com");
	}
	else if(browserName.equalsIgnoreCase("IE"))
	{
		
		System.setProperty("webdriver.ie.driver","C:\\Driver\\IEDriverServer_Win32_2.53.1.exe");
		driver=new InternetExplorerDriver();
		/*DesiredCapabilities cap=DesiredCapabilities.internetExplorer()
		cap.setPlatform(Platform.WIN10);
		URL url=new URL("http://192.168.1.11:5555/wd/hub");
		WebDriver wd=new RemoteWebDriver(url,cap);*/
	}
	driver.manage().window().maximize();
	driver.get("http://learn-automation.com");
	System.out.println(driver.getTitle());
	//driver.quit();
	
	}
	}