package Seleniumbasics;


import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class returndata {

	public static void main(String[] args) throws Exception {
		FileInputStream f2=new FileInputStream(".\\src\\test\\resources\\Testdate\\TD.xlsx");

		Workbook wb = new XSSFWorkbook(f2);

		Sheet s = wb.getSheet("facebooksheet");

		Row r1= s.getRow(0);
		Cell s1=r1.createCell(4);
		s1.setCellValue("Results");
		Row r2= s.getRow(1);
		Cell s2=r2.createCell(4);
		s2.setCellValue("pass");
FileOutputStream f3= new FileOutputStream(".\\src\\test\\resources\\Testdate\\TD.xlsx");
wb.write(f3);
		wb.close();
		
		
		
	}

}
