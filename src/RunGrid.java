import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
//import org.openqa.selenium.firefox.FirefoxBinary;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.io.File;
//import java.io.File;
import java.net.*;
import java.net.MalformedURLException;
public class RunGrid
{
	WebDriver driver;
	@Test
	public void test1() throws MalformedURLException
	{
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setCapability("binary","C:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WIN10);
		URL url=new URL("http://10.10.126.117:8081/wd/hub");
		WebDriver wd=new RemoteWebDriver(url,cap);
		wd.get("http://learn-automation.com");
		System.out.println("Title===>"+wd.getTitle());
		wd.quit();
		//System.setProperty("webdriver.gecko.driver","C:\\Driver\\geckodriver.exe");
		//cap.setCapability("marionette", true);
		//cap.setBrowserName("firefox");
		//driver=new ChromeDriver();
		//Selenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://my.test.site.org/");
		//cap.setCapability("jenkins.label","test");
		//cap.setCapability("binary","C:/Users/MST/AppData/Local/Mozilla Firefox/firefox.exe");
	}
}
