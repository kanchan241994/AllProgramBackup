package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReturnType {
	
	/*public String excelRead(int sheetNo,int rowVal,int cellVal) throws IOException {
		 FileInputStream load = new FileInputStream("C:\\Users\\kanch\\Desktop\\New Microsoft Excel Worksheet.xlsx");
			
			//workbook of excel
			XSSFWorkbook workbook = new XSSFWorkbook(load);
			
			//get sheet from workbook
			XSSFSheet sheet1 = workbook.getSheetAt(sheetNo);
			//read cell
			CellType type = sheet1.getRow(rowVal).getCell(cellVal).getCellType();
			
			if(type==CellType.NUMERIC) {
				double number = sheet1.getRow(rowVal).getCell(cellVal).getNumericCellValue();
				int num = (int) number;
				value=String.valueOf(num);
				}
			else {
				value = sheet1.getRow(rowVal).getCell(cellVal).getStringCellValue();
			}
		return value;
	}*/

}
