package learning_for_interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RedbusPage 
{
	WebDriver driver;
		
	@Test
	public void searchPage() throws InterruptedException
	{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("src")).sendKeys("Gorakhpur (uttar pradesh), Uttar Pradesh, India");
	Thread.sleep(2000);
	driver.findElement(By.id("dest")).sendKeys("Bangalore, Karnataka, India");
	Thread.sleep(2000);
	driver.findElement(By.id("date-box")).sendKeys("09-Sep-2024");
	/*
	Thread.sleep(2000);
	driver.findElement(By.id("r-date")).sendKeys("15-10");
	Thread.sleep(2000);
	*/
	driver.findElement(By.linkText("SEARCH")).click();
	Thread.sleep(2000);
	//driver.close();
	
	}
	
}
