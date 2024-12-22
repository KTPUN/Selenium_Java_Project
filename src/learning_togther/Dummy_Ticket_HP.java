package learning_togther;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.browser.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.beust.jcommander.Parameters;

public class Dummy_Ticket_HP 
{
     WebDriver driver;	

     
     
@Test
public void buy_Ticket() throws InterruptedException
{
WebDriver driver=new ChromeDriver(); //Launching the web browser 
driver.get("http://www.dummyticket.com/"); //Passing the website
Thread.sleep(3000); //Static Wait 
driver.manage().window().maximize();
//driver.findElement(By.linkText("Buy Ticket")).click();
driver.findElement(By.xpath("//a[contains(text(),'Buy Ticket')]")).click();
//int links=driver.findElements(By.tagName("a")).size();
//System.out.println("There are "+links+ " Links in this web page");
Thread.sleep(3000);

/* This is Hard Assertion 
//String ExpTitle="Dummy ticket for applying visa - Verifiable flight reservation for embassy"; //Correct Title
String ExpTitle="Dummy ticket for Verifiable flight reservation for embassy"; //Intentionally giving wrong title
String ActTitle =driver.getTitle();
Assert.assertEquals(ActTitle, ExpTitle);//If False, the program will be terminated. If True, program will be continued
System.out.println("Expetcted Title:"+ExpTitle);
System.out.println("Actual Title:"+ActTitle);

//This is Soft Assertion 
String ExpTitle="Dummy ticket for applying visa - Verifiable flight reservation for embassy"; //Correct Title
//String ExpTitle="Dummy ticket for Verifiable flight reservation for embassy"; //Intentionally giving wrong title
String ActTitle =driver.getTitle();

SoftAssert sa = new SoftAssert(); //Not static for method assertEquals 
sa.assertEquals(ActTitle, ExpTitle);//If False, the program will be terminated. If True, program will be continued

System.out.println("Expetcted Title:"+ExpTitle);
System.out.println("Actual Title:"+ActTitle);
*/
Thread.sleep(3000);
driver.findElement(By.className(".wmc-active-title")).click();
driver.findElement(By.id("product_550")).click();
//Check this below 
driver.findElement(By.className("showcoupon")).click();
Thread.sleep(3000);
driver.findElement(By.id("coupon_code")).sendKeys("ABC123");
Thread.sleep(3000);
driver.findElement(By.className("button")).click(); 
Thread.sleep(3000);
String exptMs="Coupon \"abc123\" does not exist!";
String ActMs=driver.findElement(By.xpath("//li[normalize-space()='Coupon \"abc123\" does not exist!']")).getText();
Assert.assertEquals(ActMs, exptMs);
System.out.println(ActMs);

//Coupon "abc123" does not exist!

//driver.findElement(By.id("travname")).sendKeys("David");
driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("David");

Thread.sleep(3000);
driver.findElement(By.name("travlastname")).sendKeys("Jackson");
driver.findElement(By.name("order_comments")).sendKeys("This is just a learning Selenium with Java");
//Starting drop down calendar 
/*
driver.findElement(By.id("dob")).click(); //open the calendar by clicking on the text field

Select month=new Select(driver.findElement(By.className("ui-datepicker-month")));
//month.selectByVisibleText("Jan");
//month.selectByValue("0");
month.selectByIndex(0);

Select year=new Select(driver.findElement(By.className("ui-datepicker-year")));
//year.selectByIndex(5);//This should be 1929
//year.selectByValue("1929");
year.selectByVisibleText("1929");
driver.findElement(By.xpath("//a[@data-date='12']")).click(); 

driver.findElement(By.xpath("//input[@id='sex_1']")).click(); 

driver.findElement(By.id("addmorepax")).click();
driver.findElement(By.id("traveltype_2")).click();
driver.findElement(By.id("fromcity")).sendKeys("Delhi");
driver.findElement(By.id("tocity")).sendKeys("Mumbai");

driver.findElement(By.id("departon")).click();
Select Dep_Month=new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
Dep_Month.selectByVisibleText("Nov");
//Dep_Month.selectByValue("10");
//Dep_Month.selectByIndex(10);

Select Dep_Year=new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
Dep_Year.selectByValue("2024");
driver.findElement(By.xpath("//a[@data-date='13']")).click();

driver.findElement(By.id("returndate")).click();
Select Ret_Month=new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
Ret_Month.selectByVisibleText("Dec");

Select Ret_Year=new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
Ret_Year.selectByValue("2024");
driver.findElement(By.xpath("//a[@data-date='20']")).click();
driver.findElement(By.id("notes")).sendKeys("This is just a test notes");

driver.findElement(By.id("select2-reasondummy-container")).click();
driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[8]")).click();//Prefer not to say
Thread.sleep(3000);
driver.findElement(By.id("deliverymethod_3")).click();
driver.findElement(By.id("billname")).sendKeys("Jackson Height,NewYork");

driver.findElement(By.name("billing_phone")).clear();
driver.findElement(By.name("billing_phone")).sendKeys("123-5643-987");

driver.findElement(By.id("billing_email")).clear();
driver.findElement(By.id("billing_email")).sendKeys("123@gmail.com");

driver.findElement(By.id("select2-billing_country-container")).click();
driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[235]")).click(); // US

driver.findElement(By.id("billing_address_1")).sendKeys("123 Davis St, NewYork");
driver.findElement(By.id("billing_address_2")).sendKeys("40");

driver.findElement(By.cssSelector("#billing_city")).sendKeys("Jackson Height");
driver.findElement(By.xpath("//span[@id='select2-billing_state-container']")).click();
driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[21]")).click();
driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("94577"); 
//driver.quit(); //close for closing current active window; 
//sa.assertAll();
*/
}
}



























