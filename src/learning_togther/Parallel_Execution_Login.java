package learning_togther;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_Execution_Login 
{
WebDriver driver;
@BeforeTest
@Parameters("Browser")
public void initiate(String browser)  
{
		{
		if (browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		if (browser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		if (browser.equals("Safari"))
		{
			driver=new SafariDriver();
		}
	}
	
//driver=new SafariDriver();
driver.get("https://www.automationexercise.com/");
//driver.manage().window().maximize();
}
@Test
public void Login()
{
driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
driver.findElement(By.name("email")).sendKeys("tika2pun@gmail.com");
driver.findElement(By.name("password")).sendKeys("BinaPun@2020");
driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
}
@AfterTest
public void quit_Browser() throws InterruptedException
{
Thread.sleep(3000);
driver.quit();
}
}
