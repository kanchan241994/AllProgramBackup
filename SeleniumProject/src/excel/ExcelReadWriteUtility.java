package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWriteUtility {
	
	public void excelWrite(int sheetNo,int rowVal, int cellVal, String data) throws IOException  {
      FileInputStream load = new FileInputStream("C:\\Users\\kanch\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		
		//workbook of excel
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		//get sheet from workbook
		XSSFSheet sheet1 = workbook.getSheetAt(sheetNo);
		
		FileOutputStream writeOutput = new FileOutputStream("C:\\Users\\kanch\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		sheet1.createRow(rowVal).createCell(cellVal).setCellValue(data);
		workbook.write(writeOutput);

	}
	public void excelRead(int sheetNo,int rowVal, int cellVal) throws IOException  {
	      FileInputStream load = new FileInputStream("C:\\Users\\kanch\\Desktop\\New Microsoft Excel Worksheet.xlsx");
			
			//workbook of excel
			XSSFWorkbook workbook = new XSSFWorkbook(load);
			
			//get sheet from workbook
			XSSFSheet sheet1 = workbook.getSheetAt(sheetNo);
			//read cell
			String data = sheet1.getRow(rowVal).getCell(cellVal).getStringCellValue();
			System.out.println(data);

		}


}
