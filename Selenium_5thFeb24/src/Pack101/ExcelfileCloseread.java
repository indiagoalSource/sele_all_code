package Pack101;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelfileCloseread {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path = "C:\\Users\\amol\\OneDrive\\Desktop\\testDataForSelenium.xlsx";
		FileInputStream file = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(file);
				
//		Sheet sheet = book.getSheet("my1stsheet");
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(0);
				
		String data = book.getSheet("my2ndsheet").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		
		double num = book.getSheet("my2ndsheet").getRow(1).getCell(0).getNumericCellValue();
		System.out.println(num);
		
		Date date = book.getSheet("my2ndsheet").getRow(2).getCell(0).getDateCellValue();
		System.out.println(date);
		
	//	WorkbookFactory.create(file).close();
				
		String data1 = book.getSheet("my2ndsheet").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1);
		
		
	}

}
