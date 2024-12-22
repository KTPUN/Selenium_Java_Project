package learning4Interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class All_Codes 
{
	WebDriver driver;
	@Test
	public void intv_learning() throws InterruptedException
	{
	driver =new ChromeDriver();
	driver.manage().window().maximize();
    //driver.get("https://www.automationexercise.com/login");
    driver.navigate().to("https://www.automationexercise.com/login");
	List<WebElement> links=driver.findElements(By.tagName("a"));
    System.out.println("Total Links in the Web Page:"+links.size());
	/*
    String ActTitle=driver.getTitle();
    String ExpTitle="Automation";
    SoftAssert sa=new SoftAssert();
    sa.assertEquals(ActTitle, ExpTitle);
    //Assert.assertEquals(ActTitle, ExpTitle);
        //System.out.println("The Tiile Name is: "+Title);
    
    String attrtype= driver.findElement(By.name("email")).getAttribute("type");
    System.out.println("AttrType:" +attrtype);
    String attrdataqa= driver.findElement(By.name("email")).getAttribute("data-qa");
   System.out.println("Attrid:" +attrdataqa);
   String actURL=driver.getCurrentUrl();
    System.out.println("Actual URL:" +actURL);
    driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
	driver.findElement(By.name("email")).sendKeys("tika2pun@gmail.com");
	driver.findElement(By.name("password")).sendKeys("BinaPun@2020");
    driver.navigate().back();
    Thread.sleep(3000);
    driver.navigate().forward();
    Thread.sleep(3000);
    driver.navigate().refresh();
	//driver.findElement(By.linkText("Login")).click();
	driver.close();
	//sa.assertAll();
	*/
	driver.close();
	}
	}
	
