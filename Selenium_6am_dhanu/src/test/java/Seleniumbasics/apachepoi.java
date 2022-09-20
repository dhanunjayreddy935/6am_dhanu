package Seleniumbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class apachepoi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//FileInputStream f1=new FileInputStream(".\\src\\test\\resources\\Testdate\\TD.xlsx");

//Workbook wb = new XSSFWorkbook(f1);

//Sheet s = wb.getSheet("facebooksheet");

//Row r= s.getRow(1);
//Cell us= r.getCell(0);
//Cell ps= r.getCell(1);



		FileInputStream f1=new FileInputStream(".\\src\\test\\resources\\Testdate\\TD.xlsx");

		Workbook wb = new XSSFWorkbook(f1);

		Sheet s = wb.getSheet("car");

		Row r= s.getRow(1);
		Cell url= r.getCell(1);
		Cell name= r.getCell(2);
		Cell last= r.getCell(3);
		Cell email= r.getCell(4);
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url.getStringCellValue());
		driver.findElement(By.name("firstname")).sendKeys(name.getStringCellValue());
		driver.findElement(By.name("surname")).sendKeys(last.getStringCellValue());
		driver.findElement(By.name("email")).sendKeys(email.getStringCellValue());
		
		
	}

}
