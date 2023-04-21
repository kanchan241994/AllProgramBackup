package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[]args) throws IOException {
		//get path of excel
		File path=new File("C:\\Users\\kanch\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		
		//load excel file
		FileInputStream load = new FileInputStream(path);
		
		//workbook of excel
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		//get sheet from workbook
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		FileOutputStream writeOutput = new FileOutputStream(path);
		sheet1.createRow(0).createCell(0).setCellValue("Velocity");
		workbook.write(writeOutput);

}
}