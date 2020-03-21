package bookone;

import org.openqa.selenium.By;
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
		 
		 //driver.findElement(By.id("srk"));
		 System.out.println("=======================================");
		 System.out.println("In test pack and apple class");
		 System.out.println("=======================================");
	   }
	
	
	
    /*@Test
	public static void main123()
	{
    	System.out.println("=======================================");
	    System.out.println("In test pack and apple class");
	    System.out.println("=======================================");
	    
	}*/

}
