package bookone;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Apple 
{
	
	   @Test	
	   public void main123() 
	   {
	     System.setProperty("webdriver.chrome.driver","C:\\64bitAutomationSW\\chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.apple.com");
		 driver.manage().window().maximize();
	   }
	
	
	
    /*@Test
	public static void main123()
	{
    	System.out.println("=======================================");
	    System.out.println("In test pack and apple class");
	    System.out.println("=======================================");
	    
	}*/

}
