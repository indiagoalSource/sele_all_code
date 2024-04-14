package Pack101;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class execelDataReadWrite {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path = "C:\\Users\\amol\\OneDrive\\Desktop\\testDataForSelenium.xlsx";
		
		//create reference to locate external file
		FileInputStream file = new FileInputStream(path);
		
String data = WorkbookFactory.create(file).getSheet("my1stsheet").getRow(3).getCell(1).getStringCellValue();


//		Workbook book = WorkbookFactory.create(file);	// Open the file
//		Sheet sheet = book.getSheet("my1stsheet");	// Select the sheet by name
//		Row row = sheet.getRow(3);	// Select the row
//		Cell cell = row.getCell(1);	// Select the cell
//		String data = cell.getStringCellValue();
		
		System.out.println(data);
		
	}

}
