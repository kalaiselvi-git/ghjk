package CrossBrowsers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//import org.testng.annotations.AfterTest;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLocators
{
	@Test
	/*public void Salesforce()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://login.salesforce.com");
		driver.findElement(By.name("username")).sendKeys("kalaiselvi.d@mstsolutions.com");
		driver.findElement(By.name("pw")).sendKeys("Kalai*selvi111");
		String tagname=driver.findElement(By.name("pw")).getTagName();
		System.out.println(tagname);
		driver.findElement(By.name("Login")).submit();
		String Username=driver.findElement(By.id("userNav")).getText();
		if(Username=="Kalai Selvi Dharmalingam")
		{
			System.out.println("Test case passed");
	
		}
		else
		{
			System.out.println("Test case Failed");
		}
		
	}*/
	
public  void google()
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.google.com");
	/*WebElement element =driver.findElement(By.name("q"));
	WebElement element =driver.findElement(By.id("lst-ib"));
	WebElement element =driver.findElement(By.xpath(".//*[@id='lst-ib']"));
	element.sendKeys("Cheese!");
	element.submit();
	System.out.println("Page Title is "+driver.getTitle());*/
    driver.findElement(By.linkText("Gmail")).click();
    WebElement element=driver.findElement(By.cssSelector("#identifier-shown input#Email"));
    element.sendKeys("kalai.preathy@gmail.com");
    driver.findElement(By.id("next")).submit();
    driver.findElement(By.id("Passwd")).sendKeys("kalai");
    driver.findElement(By.id("signIn")).submit();
    //driver.switchTo().window("_blank");
    System.out.println("Page Title is "+driver.getTitle());
    
    
	}
/*@Test
public void Gmail()
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.google.com");
	//**Using Xpath Locator**
	WebElement element =driver.findElement(By.xpath(".//*[@id='lst-ib']"));
    element.sendKeys("Cheese!");
	element.submit();
    System.out.println("Page Title is "+driver.getTitle());
	
}*/
}

