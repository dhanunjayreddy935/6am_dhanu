package SeleniumTestng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class testcase2 {
	WebDriver driver;
  @Test
  
  public void TC_001() {
	
	  driver.get("https://www.justrechargeit.com/");
	//  Invoke the JRI Home page
  }
  @Test
  public void TC_002() throws Exception {
	 // Click on Create new Account link
	  driver.findElement(By.linkText("Create New Account")).click();
	  Thread.sleep(5000);
  }@Test
  public void TC_003() throws Exception {
	 // Click on Create Account button without fill any data
driver.findElement(By.id("imgbtnSubmit")).click();
Thread.sleep(5000);
      String exp=  driver.findElement(By.id("nameTD")).getText();
  String    act= "Enter your name";
  if (act.equals(exp)) {
	System.out.println("pass");
} else {
System.out.println("fail");
}
  }@Test
  public void TC_004() throws Exception {
	 // Fill Name data
	  driver.findElement(By.id("signup_name")).sendKeys("dhanu");
	  driver.findElement(By.id("imgbtnSubmit")).click();
	  Thread.sleep(5000);
	 String abc= driver.findElement(By.id("mobilenoTD")).getText();
	   String def ="Enter mobile no.";
	   if (abc.equals(def)) {
		System.out.println("true");
	} else {
		System.out.println("fail");
	}
  }@Test
  public void TC_005() throws Exception {
	 // Check the Email error message
	 driver.findElement(By.id("signup_name")).sendKeys("amma");
	 driver.findElement(By.id("signup_mobileno")).sendKeys("7207174001");
	 
	 driver.findElement(By.id("imgbtnSubmit")).click();
	 Thread.sleep(5000);
	    String  qwe= driver.findElement(By.id("emailTD")).getText();
	String    uyt =" Enter your email id";
	if (qwe.equals(uyt)) {
		System.out.println("email enter ");
	} else {
System.out.println("email not enter");
	}

	 
  }@Test
  public void TC_006() throws InterruptedException {
	  // Check the Password error message
	  driver.findElement(By.id("signup_name")).sendKeys("amma");
		 driver.findElement(By.id("signup_mobileno")).sendKeys("7207174001");
		 driver.findElement(By.id("signup_email")).sendKeys("dhanunjayreddy935@gmail.com");
		 driver.findElement(By.id("imgbtnSubmit")).click();
		 Thread.sleep(5000);
		String pass= driver.findElement(By.id("passwordTD")).getText();
	            String expass=	"Enter your password";
	            if (pass.equals(expass)) {
					System.out.println("password please");
				} else {
System.out.println("fail");
				}
		 
  }@Test
  public void TC_007() throws Exception {
	  driver.findElement(By.id("signup_name")).sendKeys("amma");
		 driver.findElement(By.id("signup_mobileno")).sendKeys("7207174001");
		 driver.findElement(By.id("signup_email")).sendKeys("dhanunjayreddy935@gmail.com");
		 driver.findElement(By.id("signup_password")).sendKeys("123456");
		 driver.findElement(By.id("imgbtnSubmit")).click();
		 Thread.sleep(5000);
		    String         terms= driver.findElement(By.id("tdcondition")).getText();
		 String   cond = 		 "Please agree to the terms & conditions";
		 if (terms.equals(cond)) {
			System.out.println("terms and condition visible///////////////////////");
		} else {
System.out.println("fail");
		}
  }
  @Test
  public void TC_008()  {
	
		   driver.navigate().refresh();
		 
  } @Test
  public void TC_009() throws Exception  {
		
	driver.findElement(By.name("signup_name")).sendKeys("ramanaredyy");
	driver.findElement(By.id("signup_mobileno")).sendKeys("9550089120");
	driver.findElement(By.id("signup_email")).sendKeys("dhanukl955@gmail.com");
	driver.findElement(By.id("signup_password")).sendKeys("123456");
	driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).click();
	driver.findElement(By.id("imgbtnSubmit")).click();
	 Thread.sleep(4000);
}
	  
  
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.edgedriver().setup();
	  driver= new EdgeDriver();
	  driver.manage().window().maximize();
	
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
