package Package;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;


public class MultipleWIndows {

	public static void main (String[] args) throws InterruptedException
	  {

		 WebDriver driver = new FirefoxDriver(); 
		 driver.manage().window().maximize();
		 driver.get ("http://www.hdfcbank.com");
		 Thread.sleep(5000);
		 System.out.println("Get the window handles");
		 String windowhandle=driver.getWindowHandle();
		 System.out.println("single window handle name :"+ windowhandle);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[@id='loginsubmit']")).click();
		 Thread.sleep(2000);
		 Set<String> windowhandes = driver.getWindowHandles();
		 System.out.println("post click button, display 2 window handles");
		
		 for (String i: windowhandes) {
			 System.out.println("in loop");
		     System.out.println(i);
		     System.out.println("Window title :"+driver.switchTo().window(i).getTitle());
			 
		     
		 } 
		 //java.util.Set<java.lang.String> getWindowHandles()// 

//		A set of window handles which can be used to iterate over all open windows.
		 Set<String> AllWindowHandles = driver.getWindowHandles(); 
		 System.out.println(AllWindowHandles.size());
		 
		 //<T> T[] toArray(T[] a)

		 //This method returns an array containing all of the elements in this list in proper sequence 
		 //(from first to last element); the runtime type of the returned array is that of the specified array.
		 String window1 = (String) AllWindowHandles.toArray()[0];
		 System.out.print("window1 handle code = "+AllWindowHandles.toArray()[0]);
		 String window2 = (String) AllWindowHandles.toArray()[1]; 
		 System.out.print("\nwindow2 handle code = "+AllWindowHandles.toArray()[1]);
		 
		 
		
		  driver.switchTo().window(window2);
		 
		  driver.findElement(By.linkText("Clearing Browser Cache")).click();
		  driver.close();
}
}




