package bookone;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Clock 
{

	@Test
	public static void main456() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\64bitAutomationSW\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
	   System.out.println("=======================================");
	   System.out.println("In test pack and clock class");
	   System.out.println("=======================================");
	    
	}

}
