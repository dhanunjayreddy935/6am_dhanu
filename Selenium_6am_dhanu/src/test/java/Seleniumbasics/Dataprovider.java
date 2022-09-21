package Seleniumbasics;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class Dataprovider {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String use, String fac) {
	  WebDriverManager.edgedriver().setup();
	  driver= new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.id("email")).sendKeys(use);
	  driver.findElement(By.id("pass")).sendKeys(fac);
	  driver.findElement(By.name("login")).click();
	
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "bcdbdsjsb@gmail.com", "dhanu" },
      new Object[] { "bcdbdsgsb@gmail.com", "faddfdf"},
      new Object[] { "bcdbdsjb@gmail.com", "dhanubgb" },
      new Object[] { "bhgdbdsjsb@gmail.com", "dhanukj" },
      new Object[] { "bcdbdsjjb@gmail.com", "dhanuj" },
      
      
    };
  }
}
