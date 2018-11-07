//THIS SCRIPT IS FOR MOUSE AND KEYBOARD OPERATIONS
package Package;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import java.util.concurrent.TimeUnit;
//import java.lang.*;
import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AzziAutomationMouseScript
  {
	
  public static void main (String[] args) throws InterruptedException
  {
	
 // Initiate the Firefox driver class	 
	  //	 System.setProperty("webdriver.gecko.driver", "C:\\firefoxdriver\\geckodriver.exe");
	  //	 WebDriver driver = new FirefoxDriver(); 
	  	 

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	  	 String url ="http://www.xpr2t.com/Webobjects.html";
	  	 driver.manage().window().maximize();
	  	 driver.get(url);

	  	
	  	 
//INTIATE THE ACTION CLASS	      
	    Actions act=new Actions(driver);
	    WebElement userid=driver.findElement(By.id("usernameid"));
//MOVE MOUSE TO ELEMENT
	     act.moveToElement(userid).perform();
	   	 Thread.sleep(5000);
//PERFORM KEYBOARD SEND TEXT
	     act.sendKeys(userid, "selenium").perform();
	     Thread.sleep(5000);
//PERFROM MOUSE RIGHT CLICK 
	     act.contextClick(userid).perform();
	      Thread.sleep(5000);
// PERFORM MOUSE CLICK AND HOLD
	      act.clickAndHold(userid).perform();
//PERFORM RELEASE MOUSE ON ELEMENT
	      act.release(userid).perform();
	      Thread.sleep(5000);      
 //PERFORM ENTER KEY FROM KEYBOARD
	      act.sendKeys(userid, Keys.ENTER).perform();
 // PERFROM SHIFT, ALT, CONTROL KEYS
	   	     //Keys.ALT, Keys.SHIFT, or Keys.CONTROL)
 // Perform SHIFT +f7
	      act.keyDown(userid, Keys.SHIFT).perform();
	      act.sendKeys(Keys.F7).perform();
	      
	      driver.close();
	      driver.quit();
  
  }
  }