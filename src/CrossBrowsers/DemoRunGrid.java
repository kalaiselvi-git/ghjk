package CrossBrowsers;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class DemoRunGrid {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path = new File("C:/Users/MST/AppData/Local/Mozilla Firefox/firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(path);
		FirefoxProfile ffProfile = new FirefoxProfile();
		driver=new FirefoxDriver(ffBinary,ffProfile);
		//DesiredCapabilities cap=DesiredCapabilities.firefox();
		driver.get("http://www.seleniumhq.org/download/");

	}

}
