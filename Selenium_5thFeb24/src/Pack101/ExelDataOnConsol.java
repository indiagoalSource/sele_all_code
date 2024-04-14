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

public class ExelDataOnConsol {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		String path = "C:\\Users\\amol\\OneDrive\\Desktop\\testDataForSelenium.xlsx";
		FileInputStream file = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(file);
		//Sheet sheet = book.getSheet("my1stsheet");
		Sheet sheet = book.getSheetAt(0);
		
		for(int i=0; i<=sheet.getLastRowNum(); i++)
		{
			for(int j=0; j<=1; j++)
			{
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+ " , ");
			}
			System.out.println();
			
		}
		
	}
	
}
