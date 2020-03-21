package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample 
{
	@Test
    public static void mainpqr() 
    {
		System.setProperty("webdriver.chrome.driver","C:\\64bitAutomationSW\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.whatsapp.com");
		driver.manage().window().maximize();
		
		System.out.println("=======================================");
	    System.out.println("Demo pack sample class 1");	
	    System.out.println("=======================================");
	    
	}
}
