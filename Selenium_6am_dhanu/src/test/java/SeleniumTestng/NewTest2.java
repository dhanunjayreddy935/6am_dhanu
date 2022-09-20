package SeleniumTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest2 {
	  WebDriver driver;
  @Test
  public void TC_001() {
	  WebDriverManager.chromedriver().setup();

	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  //getURL
	  driver.get("https://www.facebook.com/");
  }
  @Test
  public void TC_002() {
driver.findElement(By.id("email")).sendKeys("dhanunjayreddy935@gmail.com");
driver.findElement(By.id("pass")).sendKeys("dhanu");
	
  }
  @Test
  public void TC_003() {
driver.findElement(By.name("login")).click();

	  	
	    }
  @Test
  public void TC_004() {
	
driver.findElement(By.linkText("Forgotten password?")).click();
// String actu=      driver.findElement(By.className("_9nq2 marginBottom16px")).getText();
 //System.out.println(actu);
	  	  	
	  	    }
}
