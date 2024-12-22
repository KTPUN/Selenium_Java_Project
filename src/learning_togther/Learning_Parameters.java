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

public class Learning_Parameters 
{
WebDriver driver;
@Parameters ("Browser")

@BeforeTest
public void initialize_Webdriver(String browserurl)
{
if (browserurl.equalsIgnoreCase("chrome"))// equals(Chrome)
{
	driver = new ChromeDriver();
	}

if (browserurl.equalsIgnoreCase("firefox"))
{
	driver = new FirefoxDriver();
	}

if (browserurl.equalsIgnoreCase("safari"))
{
	driver = new SafariDriver();
	}

//driver = new ChromeDriver(); 
driver.get("https://www.automationexercise.com/");
driver.manage().window().maximize(); //comment this to test parallel testing 
}
@Test
public void login_func() throws InterruptedException
{ 
//driver.findElement(By.xpath("//a[contains(text(),' Signup / Login') ]")).click();	
driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();	
driver.findElement(By.name("email")).sendKeys("tika2pun@gmail.com");
Thread.sleep(3000);
//driver.findElement(By.name("password")).sendKeys("abc");
}

@AfterTest
public void quit_browser()
{
	driver.quit();
	}
}
