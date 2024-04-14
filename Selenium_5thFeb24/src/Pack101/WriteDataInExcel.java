package Pack101;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\amol\\OneDrive\\Desktop\\testDataForSelenium.xlsx");
		Workbook book = WorkbookFactory.create(file);
	//	Sheet sheet = book.createSheet("inputFromjava");
	//	Sheet sheet = book.getSheet("inputFromjava");
		Sheet sheet = book.createSheet("Java_INPUT");
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("this is test data");
		row.createCell(1).setCellValue("data");
		
		Row row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue("this is test data_1");
		row1.createCell(1).setCellValue("data_1");
		
		
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\amol\\OneDrive\\Desktop\\testDataForSelenium.xlsx");
		book.write(file1);
		
		System.out.println("Done ..");
		
		
	}
	
}
