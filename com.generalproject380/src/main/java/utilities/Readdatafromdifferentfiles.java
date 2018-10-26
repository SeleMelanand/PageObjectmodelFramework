package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Readdatafromdifferentfiles {
	public static Properties property;

	// Extracting data from Property file-- used to maintain the properties of all
	// web elements pagewise in a single file
	public String extractdata(String variable) throws IOException {
		property = new Properties();
		File fil = new File("./project.properties");
		FileInputStream obj = new FileInputStream(fil);
		property.load(obj);

		String datavalue = property.getProperty(variable);
		return datavalue;
	}

	
	// Extracting data from excel sheet and use it testcase during runtime
	public static Object[][] datareading(String sheetname) throws IOException {
		FileInputStream fis = new FileInputStream("./testdata/inputdatasheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet worksheet = workbook.getSheet(sheetname);
		int rowcount = worksheet.getLastRowNum() + 1;
		System.out.println(rowcount);

		XSSFRow row = worksheet.getRow(0);
		int columncount = row.getLastCellNum();
		Object[][] data = new String[rowcount][columncount];

		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < columncount; j++) {
				// String cell= worksheet.getRow(i).getCell(0);
				String cellvalue = worksheet.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(cellvalue);
				data[i][j] = cellvalue;
			}
		}
		fis.close();
		
		return data;

	}

}
