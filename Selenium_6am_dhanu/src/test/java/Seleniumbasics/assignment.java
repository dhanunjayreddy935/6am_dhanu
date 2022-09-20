package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment {
public static void main(String[] args) {
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.justrechargeit.com/");
	driver.findElement(By.id("txtMobileNo")).sendKeys("7207174001");
	Select r1= new Select(driver.findElement(By.name("ddlMobileServiceProvider")));
	r1.selectByVisibleText("AIRTEL");
	driver.findElement(By.id("amount_textfield")).sendKeys("50");
	
}
}
