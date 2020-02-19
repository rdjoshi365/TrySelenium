package Project2.MavenTestProjectOne;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 
{
@Test
void googleTitleTest()
{
	System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver_win32/chromedriver.exe"); 
	ChromeDriver driver = new ChromeDriver();
Reporter.log("Launch the Browser"); 
driver.get("https://www.google.com/"); 
Reporter.log("Enter the URL"); 
String ExpectedTitle="Google G"; 
String ActualTitle=driver.getTitle();
Reporter.log("getting the Title");
Assert.assertEquals(ActualTitle, ExpectedTitle);
Reporter.log("Verification is Success");
driver.quit();
}
//@Test
void googleTitleTest2()
{
System.out.println("Test Case Pass 2");
}
@Test 
void googleTitleTest30()
{
System.out.println("Test Case Pass 3");
}
}