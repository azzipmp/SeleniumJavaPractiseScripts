package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RealMouseMenuOperations {
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main (String[] args) throws InterruptedException
	  {
		

		   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		 //WebDriver driver = new ChromeDriver(); 
		  String url = "http://www.bankrate.com/mortgage.aspx?ic_id=home_smart-spending_mortgages_globalnav";
	// MAximize the browser
		  	driver.manage().window().maximize();
	  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  // Open the application in the browser
	  // Open Url
		  	driver.get(url);
		  	Thread.sleep(5000);
		  	//Initiate Actions class
		    Actions actions= new Actions(driver);
		    
		     WebElement mortgaelink=driver.findElement(By.linkText("MORTGAGES"));
		     
		     actions.moveToElement(mortgaelink).perform();
		     
		     WebElement mortagecallink=driver.findElement(By.linkText("Mortgage Calculator"));	
		     actions.moveToElement(mortagecallink).click().perform();
		     Thread.sleep(5000);		    
    	      
		      driver.close();
}
}