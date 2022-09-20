package Seleniumbasics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getdataexcelsheet2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f1=new FileInputStream(".\\src\\test\\resources\\Testdate\\TD.xlsx");

		Workbook wb = new XSSFWorkbook(f1);

		Sheet s = wb.getSheet("car");

	//	Row r= s.getRow(1);
		//Cell url= r.getCell(0);
		//Cell name= r.getCell(1);
		//Cell pass= r.getCell(2);
	//	Cell email= r.getCell(3);
		
		Row r1= s.getRow(0);
		Cell s1=r1.createCell(4);
		s1.setCellValue("Results");
		Row r2= s.getRow(1);
		Cell s2=r2.createCell(4);
		s2.setCellValue("pass");
		FileOutputStream f3 = new FileOutputStream(".\\src\\test\\resources\\Testdate\\TD.xlsx");
		wb.write(f3);
		wb.close();

	
	//	WebDriver driver;
//	WebDriverManager.chromedriver().setup();
	//	driver =new ChromeDriver();
	//	driver.manage().window().maximize();
//driver.get(url.getStringCellValue());
//driver.findElement(By.name("firstname")).sendKeys(name.getStringCellValue());
//driver.findElement(By.name("surname")).sendKeys(pass.getStringCellValue());
//driver.findElement(By.name("email")).sendKeys(email.getStringCellValue());


		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
