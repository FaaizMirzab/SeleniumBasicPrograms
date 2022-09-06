package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFromExcelSheet {
      public static void main(String[] args) throws EncryptedDocumentException, IOException {
          FileInputStream fis = new FileInputStream("C:\\Users\\Hp\\git\\repository\\SeleniumPractice\\src\\test\\resources\\Book1.xlsx");
          Workbook wb = WorkbookFactory.create(fis);
          Cell value = wb.getSheet("Sheet1").getRow(0).getCell(0);
          System.out.println(value);
      }
}
