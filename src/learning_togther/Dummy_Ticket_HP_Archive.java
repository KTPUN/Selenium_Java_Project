package learning_togther;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dummy_Ticket_HP_Archive 
{
WebDriver driver;	

@Test
public void buy_Ticket() throws InterruptedException
{
WebDriver driver=new ChromeDriver(); //Launching the web browser 
driver.get("http://www.dummyticket.com/"); //Passing the website
Thread.sleep(3000);
driver.manage().window().maximize();
driver.findElement(By.linkText("Buy Ticket")).click();
Thread.sleep(3000);
driver.findElement(By.id("product_550")).click();
driver.findElement(By.id("travname")).sendKeys("David");
Thread.sleep(3000);
driver.findElement(By.name("travlastname")).sendKeys("Jackson");
Thread.sleep(3000);
driver.findElement(By.name("dob")).click();
Select dob_month=new Select(driver.findElement(By.className("ui-datepicker-month")));
dob_month.selectByVisibleText("Nov");
Thread.sleep(3000);
Select dob_year=new Select(driver.findElement(By.className("ui-datepicker-year")));
dob_year.selectByVisibleText("2005");
driver.findElement(By.xpath("//a[@data-date='5']")).click();
Thread.sleep(3000);
/*
driver.findElement(By.id("sex_1")).click();
Thread.sleep(3000);
driver.findElement(By.id("traveltype_1")).click();
Thread.sleep(3000);
driver.findElement(By.name("fromcity")).sendKeys("Delhi");
driver.findElement(By.name("tocity")).sendKeys("Mumbai");
Thread.sleep(3000);
driver.findElement(By.name("departon")).sendKeys("01/01/25");
Thread.sleep(3000); */
driver.quit(); //close for closing current active window; 
}
}
