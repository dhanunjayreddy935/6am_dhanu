package Seleniumbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebooklogin {
public static void main(String[] args) throws Throwable {
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	
	FileInputStream f2 = new FileInputStream(".\\src\\test\\resources\\excelassignment");
	
	FileInputStream f3 = new fil
	Workbook wb = new XSSFWorkbook(f2);

	Sheet s = wb.getSheet("car");

	Row r= s.getRow(0);
	Cell url= r.getCell(0);
	//Cell name= r.getCell(2);
//	Cell last= r.getCell(3);
//	Cell email= r.getCell(4);
	
	driver.get(url.getStringCellValue());
}
}
