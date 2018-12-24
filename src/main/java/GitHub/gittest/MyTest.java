package GitHub.gittest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class MyTest {
	WebDriver  d;
  @Test
  public void open() throws InterruptedException {
	  
	  	//String exePath = "D:\\Selenium Projects\\Practice\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", exePath);
		 d = new FirefoxDriver();
		d.get("http://192.168.10.16:9101/clientportal/ajg");
		d.manage().window().maximize();
		d.findElement(By.id("emailId")).sendKeys("autuser01@xeno.com");//autuploaduser01@xeno.com
		d.findElement(By.id("password")).sendKeys("Admin1234$");
		d.findElement(By.id("loginSubmit")).click();		
		Thread.sleep(5000);
		String actTitle=d.getTitle();
		String expTitle="Circulus - Dashboard";
		Assert.assertEquals(actTitle, expTitle);

  }
  @AfterClass
  public void close() throws InterruptedException{
	  Thread.sleep(5000);
	  d.close();
  }
}
