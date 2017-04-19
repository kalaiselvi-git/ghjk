import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class test2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	
		WebDriver driver=new FirefoxDriver();
		driver.get("http://learn-automation.com");
		driver.quit();
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
	    
		WebDriver driver1=new ChromeDriver();
	    driver1.get("http://google.com");
	    String str=driver1.getTitle();
	    System.out.println("Title is------------>"+str);

	}

}
