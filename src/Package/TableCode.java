package Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableCode {

	public static void main (String[] args) throws InterruptedException
	  {
		  String alertMessage;

			System.setProperty("webdriver.gecko.driver", "C:\\firefoxdriver\\geckodriver.exe");
		 	WebDriver driver = new FirefoxDriver();
		 	
		 	 String url ="http://www.xpr2t.com/Webobjects.html";
		 	 driver.manage().window().maximize();
		 	 
		  driver.get(url);
		 
		 WebElement Table = driver.findElement(By.id("booktable"));
		 
		 List<WebElement> Row = Table.findElements(By.tagName("tr"));
		 System.out.println("tabe=le no of rows:"+Row.size());
		  for (WebElement i: Row)
		  {
			  
			  List<WebElement> Cols = i.findElements(By.tagName("td"));
			  System.out.println("tabe=le no of rows:"+Cols.size());
			    for (WebElement j:Cols)
			    {
					  System.out.println("cell value:"+j.getText());
			    }
			    
			    }
		  
		  // ANOTHER APPROCAH TO RETIVE VALUE FROM TABLE
		  
		  WebElement val = driver.findElement(By.xpath(".//*[@id='booktable']/tbody/tr[1]/td[1]"));
		  System.out.println("Another approach cell value :"+val.getText());
		  driver.close();
  }
}

