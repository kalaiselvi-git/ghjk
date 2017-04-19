package CrossBrowsers;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
class TestcaseLinkedIn 
{
	@Test
	public  void Test()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.linkedin.com/");
	    driver.findElement(By.id("login-email")).sendKeys("kalaiselvi.d@mstsolutions.com");
	    driver.findElement(By.id("login-password")).sendKeys("Kalai1893");
	    driver.findElement(By.id("login-submit")).submit();
	    String username=driver.findElement(By.xpath("html/body/nav/div/ul[1]/li[6]/div/ul/li[1]/a/span[2]/h3")).getText();
	    if(username=="Kalai Selvi Dharmalingam")
	    {
	    System.out.println("Test Passed");
	 	 }
	    else
	    {
	    	System.out.println("Test Failed");
	    }
	    }

}
