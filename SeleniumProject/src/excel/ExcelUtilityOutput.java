package excel;

import java.io.IOException;

public class ExcelUtilityOutput {
	public static void main(String[] args) throws IOException{
		ExcelReadWriteUtility obkext = new ExcelReadWriteUtility();
		//obkext.excelWrite(0,0,0,"pune0");
		//obkext.excelWrite(0,1,0,"Automation");
		//obkext.excelWrite(0,2,0,"velocity");
	
		obkext.excelRead(0,0,0);
		obkext.excelRead(0,1,0);
		obkext.excelRead(0,2,0);
		

	}

}
