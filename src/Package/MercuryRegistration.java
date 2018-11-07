//SCRIPT NAME :  Mercury Registration Flight project user registration functionality Script
package Package;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

//import java.util.concurrent.TimeUnit;
//import java.lang.*;
//import java.io.*;
import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MercuryRegistration {


	  public static void main (String[] args) throws InterruptedException
	  {
		   
		  		System.setProperty("webdriver.gecko.driver", "C:\\firefoxdriver\\geckodriver.exe");
		  		WebDriver driver = new FirefoxDriver();
		  		String url = "http://newtours.demoaut.com/";
		 	  	driver.manage().window().maximize();
		 	  	driver.get(url);
		 		Thread.sleep(6000);
		 	  	driver.findElement(By.linkText("REGISTER")).click();
		 	  	Thread.sleep(2000);
		 	  	driver.findElement(By.name("firstName")).sendKeys("Testfirstname");
		 	  	driver.findElement(By.name("lastName")).sendKeys("Testlastname");
		 	  	driver.findElement(By.name("phone")).sendKeys("8888888889");
		 	  	driver.findElement(By.name("userName")).sendKeys("testusername");
		 	  	driver.findElement(By.name("address1")).sendKeys("testaddress");
		 	  	driver.findElement(By.name("address2")).sendKeys("testaddress2");
		 	  	driver.findElement(By.name("city")).sendKeys("Herndon");
		 	  	driver.findElement(By.name("state")).sendKeys("Va");
		 	  	driver.findElement(By.name("postalCode")).sendKeys("23456");
		 	  	Select drpcountry = new Select(driver.findElement(By.name("country")));
		 	    drpcountry.selectByVisibleText("UNITED STATES");
		 	    driver.findElement(By.name("email")).sendKeys("Test@test.com");
		 	    driver.findElement(By.name("password")).sendKeys("Test1234$");
		 	    driver.findElement(By.name("confirmPassword")).sendKeys("Test1234$");
		 	    driver.findElement(By.name("register")).click();
		 	    Thread.sleep(2000);
		 	    driver.findElement(By.linkText("SIGN-OFF")).click();
		 	    Thread.sleep(2000);
		 	   driver.close();
		 	   driver.quit();

	  }
	  
}
