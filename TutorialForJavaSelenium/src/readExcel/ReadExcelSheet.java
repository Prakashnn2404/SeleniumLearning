package readExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadExcelSheet {

	public static void main(String[] args) throws Exception {
		
		File file=new File("");
		FileInputStream fs=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fs);

	}

}
