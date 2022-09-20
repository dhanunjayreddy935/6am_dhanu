package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testngbeginer {
	  WebDriver driver;
  @Test
  public void TC_001() {
	
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.justrechargeit.com/");
		
  }
  @Test
  public void TC_002() {
driver.findElement(By.id("signup-link9")).click();
String exurl="https://www.justrechargeit.com/SignUp.aspx";
if (driver.getCurrentUrl().equals(exurl)) {
	System.out.println("created new page open");
} else {
System.out.println("create open page not open");
}
  }
  @Test

  public void TC_003() {

	 
	driver.findElement(By.name("imgbtnSubmit")).click();

	    }
  @Test
  public void TC_004() {
	    	driver.findElement(By.id("signup_name")).sendKeys("dhanu");
	    } public void TC_005() {
	    	driver.findElement(By.id("signup-link9")).click();
	    } public void TC_006() {
	    	driver.findElement(By.id("signup-link9")).click();
	    } public void TC_007() {
	    	driver.findElement(By.id("signup-link9")).click();
	    }
}
