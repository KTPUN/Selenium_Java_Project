package learning_togther;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FB_Login 
{
WebDriver driver;
@Parameters ({"url"})
@Test

public void launchbrowser(String url)
{
driver =new ChromeDriver();
//driver.get("https://facebook.com");
}
}


