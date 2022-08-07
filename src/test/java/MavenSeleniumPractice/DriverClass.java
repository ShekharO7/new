package MavenSeleniumPractice;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;




public class DriverClass {
	WebDriver driver;
 @BeforeSuite
 public void launch()
 {
	 System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.automationexercise.com");
	
 }
 @Test
 public void verifytitle()
 {
	
	 String expectedtitle="Automation Exercise";
	String gettitle=driver.getTitle();
	Assert.assertEquals(expectedtitle,gettitle);
 }
 @Test
 public void test()
 {
	 System.out.println("Test");
 }
 @AfterSuite
 public void close() {
	 driver.close();
 }
}
