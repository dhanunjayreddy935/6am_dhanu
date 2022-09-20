package Seleniumbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apache {

	public static void main(String[] args) throws Exception {
		FileInputStream f9= new FileInputStream(".\\src\\test\\resources\\Testdate\\TD.xlsx");
		Workbook ws = new XSSFWorkbook(f9);
		Sheet p = ws.getSheet("car");
		
	}

}
