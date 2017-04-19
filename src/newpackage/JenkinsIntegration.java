package newpackage;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

//import java.io.File;
//import java.io.File;
import java.net.*;
import java.net.MalformedURLException;
public class JenkinsIntegration
{
	WebDriver driver;
	@Test
	public void test1() throws MalformedURLException
	{
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		//cap.setCapability("binary","C:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		URL url=new URL(" http://192.168.100.109:4444/wd/hub");
		WebDriver wd=new RemoteWebDriver(url,cap);
		wd.get("http://learn-automation.com");
		System.out.println("Title===>"+wd.getTitle());
		wd.quit();
	}
}
