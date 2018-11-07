package Package;
import java.io.*;

import org.apache.commons.io.FileUtils;
//import java.io.File;
//import java.io.IOException; 
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
//import org.eclipse.jetty.server.Response.OutputType;
//import org.openqa.selenium.OutputType; 
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Capturing screenshot

public class CaptureScreenshot {
	 
	   public static void main (String[] args) throws InterruptedException, IOException
		{ //Capture entire page screenshot and then store it to destination drive
		   
			System.setProperty("webdriver.gecko.driver", "C:\\firefoxdriver\\geckodriver.exe");
		 	WebDriver driver = new FirefoxDriver();
		
		 	 String url ="http://www.xpr2t.com/Webobjects.html";
		 	 driver.manage().window().maximize();
		     driver.get(url);
			 // Maximize the browser
			 	
			     Thread.sleep(5000);
			 
			     File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			     FileUtils.copyFile(screenshot, new File("D:\\Selenium - Java\\screenshot.jpg")); 
			    
			     System.out.print("Screenshot is captured and stored in your D: Drive");
			     Thread.sleep(2000); 
			    
			     driver.close();
			     driver.quit();
		} 
	

}
