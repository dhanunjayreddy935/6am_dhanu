package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ciudsh {

	public static void main(String[] args) {
		 WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.justrechargeit.com/");
			driver.findElement(By.id("signup-link9")).click();
			String exurl="https://www.justrechargeit.com/SignUp.aspx";
			if (driver.getCurrentUrl().equals(exurl)) {
				System.out.println("created new page open");
			} else {
			System.out.println("create open page not open");
			}
	}

}
