package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel implements IConstant{
	public void readExcel() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(Ex_Path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
	}

}
