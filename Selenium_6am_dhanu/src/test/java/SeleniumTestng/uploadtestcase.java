package SeleniumTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uploadtestcase {
	  WebDriver driver;
  @Test
  public void TC_001() {
	  WebDriverManager.chromedriver().setup();

	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  //getURL
	  driver.get("https://www.justrechargeit.com/");
  }
  @Test
  public void TC_002() {
	
//Click on create new account link
	  driver.findElement(By.id("signup-link9")).click();
  }@Test
  public void TC_003() {
	 
	driver.findElement(By.name("imgbtnSubmit")).click();
	  

  }@Test
  public void TC_004() {
	
  }@Test
  public void TC_005() {
	
  }
  
}
