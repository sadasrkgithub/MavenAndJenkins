package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Grape 
{
 
	@Test
	public static void mainabc() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\64bitAutomationSW\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		
		/*
		System.out.println("=======================================");
	    System.out.println("Demo pack grape class");
	    System.out.println("=======================================");
	    */
	}

}
