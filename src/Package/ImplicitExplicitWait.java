package Package;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;


public class ImplicitExplicitWait {
	
	  public static void main (String[] args) throws InterruptedException
	   {
	    String url = "http://newtours.demoaut.com/";
		
	    System.setProperty("webdriver.gecko.driver", "C:\\firefoxdriver\\geckodriver.exe");
	 	WebDriver driver = new FirefoxDriver();

	 	
	 	
	 	//  ############Implict wait#####################
//IMPLICIT WAIT - used to set the default waiting time throughout the program
	 	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(2000);//2+20=22
							
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("email")).sendKeys("Test@test.com");
 	    driver.findElement(By.name("password")).sendKeys("Test1234$");
 	    driver.findElement(By.name("confirmPassword")).sendKeys("Test1234$");
 	    driver.findElement(By.name("register")).click();
 	    Thread.sleep(2000);
 	    driver.findElement(By.linkText("SIGN-OFF")).click();
 	   // Thread.sleep(2000);
	//  ############ end of Implict wait#####################

	
 	    
 	    
 //   START EXPLICT WAIT	    
//EXPLICIT WAIT  -An explicit waits is code you define to wait up to certain seconds for a certain condition to occur before proceeding further in the code. 
		 	  	
 //	  	Thread.sleep(2000);
		
//	1. Explicit wait - WAIT UNTILL ELEMENT IS CLICKABLE
 	    
 	   driver.manage().window().maximize();
		driver.get(url);;
		
		WebDriverWait wait= new WebDriverWait(driver,200);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Home")));
							
		driver.findElement(By.linkText("REGISTER")).click();

		// WebDriverWait wait = new WebDriverWait(driver, 15); 
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("REGISTER")));
		 driver.findElement(By.linkText("REGISTER")).click();
		 	  
 // 2. Explicit wait - textToBePresentInElementLocated
		 	  	 ///	wait.until(driver.findElement(By.linkText("REGISTER"))); 
		 wait.until(ExpectedConditions.textToBePresentInElementLocated(By.name("country"), "UNITED STATES")); 
		 	  	 	
 //	3. Explicit wait -alert is present
		// 	  	 	wait.until(ExpectedConditions.alertIsPresent()); 
		 //	  	 String alrt = driver.switchTo().alert().getText();
		 	//  	 System.out.print(alrt); 
		 	  	 	
		 	  	//4. visibilityOfElementLocated
	//	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstName']"))); 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName"))); 

		 
		 
// ###############END EXPLICT WAIT#######################
		  driver.close();
}
	  
}