// Below script contains some advanced concepts like findelements, drop down values count, and 
//identification of dynamic changing object attributes.

package Package;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

//import java.util.concurrent.TimeUnit;
//import java.lang.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;


public class AdvanceScripts {

	public static void main (String[] args) throws InterruptedException
	  {
		  String alertMessage;

			System.setProperty("webdriver.gecko.driver", "C:\\firefoxdriver\\geckodriver.exe");
		 	WebDriver driver = new FirefoxDriver();
			 	
		 	 String url ="http://www.xpr2t.com/Webobjects.html";
		 	 driver.manage().window().maximize();
		     driver.get(url);
		  //findElements method will return list of all the matching elements from current page as per given element locator mechanism. 
		  //If not found any element on current page as per given element locator mechanism, it will return empty list.
	
//  ****************  FIND THE LIST OF TEXT FILEDS IN THE WEBPAGE DYNAMICALLY ******************************		  
		  
		     
		     
		   // driver.findElement(By.id("u_0_n1778433")).sendKeys("john");
		  
		  //   WebElement textfiled=driver.findElement(By.id("u_0_n"))
		 //    textfiled.sendKeys("John");
		     
		     
		  List<WebElement> textelements =  driver.findElements(By.xpath("//input[@type = 'text']"));
		  System.out.println("list of vaues size:" + textelements.size());
		  
		  
		 
		  textelements.get(0).sendKeys("Type text Firstname USEAGE");
		  
		  Thread.sleep(1000);
		//  textelements.get(1).sendKeys("type text FINDELEMENTS USEAGE");
		  
		//  Thread.sleep(5000);
/*  
		 int nooftextfields= textelement.size();
		 for (int i=0 ; i<=nooftextfields-1;i++)
		 {
			// System.out.println("i value" + i);
			 textelement.get(i).sendKeys("FINDELEMENTS USEAGE");
		 }
 */
		  //############### ANOTHER APPROACH
	//	  for (WebElement i: textelement)
	//	 	{
		  
		//	  String name =i.getAttribute("name");
		//	  System.out.println("Text filed name:" + name);
		//	  i.sendKeys("selenium");
		//	  i.clear();
		//	  Thread.sleep(4000);
		//  }
		
// HANDLYING DYNAIC OBJECTS
		  //  #################### XPATH CONTAINS AND STARTS WITH REGULAR EXPRESSION - LOCATING OBJECT ############
		  
		  // USING CONTAINS METHOD in XPATH - CONTAINS
		 // u_0_n1778433
		//  u_0_n778
		  //u_0_p987we
		  
		 /* 
		  WebElement firstname= driver.findElement(By.xpath("//input[contains(@id,'u_0_n')]"));
		  
		  firstname.sendKeys("john");
		  
WebElement lastname= driver.findElement(By.xpath("//input[contains(@id,'u_0_p')]"));
		  
lastname.sendKeys("john");
*/
		  
		  WebElement element = driver.findElement(By.xpath("//input[contains(@id,'username')]"));
		  element.sendKeys("xpath contains");
		  Thread.sleep(2000);
		  element.clear();
		  
		  //ANother approach to handle dynamic objects  -starts-with
		  WebElement element1 = driver.findElement(By.xpath("//input[starts-with(@id,'username')]"));
		  element1.sendKeys("Starts with");
		  Thread.sleep(2000);
		
		  
		  
// ###################  DROP DOWN BOX SELECTION ##############################
		  
		  Select drpcountry = new Select(driver.findElement(By.id("test")));
	 	 
		  List<WebElement>  drpvalue=  drpcountry.getOptions();
		  
		 // List<WebElement> names=drpcountry.getOptions();
	 	 
	 	  System.out.println("Size of drop down values:"+ drpvalue.size());
	 	 System.out.println("First value from drop down box:"+ drpvalue.get(0).getAttribute("text"));
	 	System.out.println("Second value from drop down box:"+ drpvalue.get(1).getAttribute("text"));
	 Thread.sleep(2000);

//  #################  ANOTHER WAY OF RETRIVING VALUES FROM DROP DOWN BOX
	 	
	 System.out.println("ANother way to retrive values from Drop down values");
	 
	 WebElement select = driver.findElement(By.id("test"));
	 // Select drpcountry1 = new Select(driver.findElement(By.id("test")));
	  
	 
	 	List<WebElement> elements=select.findElements(By.tagName("option"));
	 	
	 	for (WebElement i: elements)
	 	{
	 		  System.out.println("Drop down values:" + i);	
	 		  System.out.println(i.getAttribute("value"));
	 		 System.out.println(i.getText());
	 		  if ("Non Reportable".equals(i.getText()))
	 			  {
	 					 System.out.println("non reportable ");
	 					 i.click();
	 					  Thread.sleep(4000);
	 			  }
	 		
	 		  }
	 	driver.close();
		 }
	  


}


		



