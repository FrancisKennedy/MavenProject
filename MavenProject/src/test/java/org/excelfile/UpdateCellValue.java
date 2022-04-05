package org.excelfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateCellValue {
		public static void main(String[] args) throws IOException  {
			File file = new File("C:\\Users\\franciskenny\\eclipse-workspace\\"
					+ "MavenProject\\ExcelFolder\\excelnew.xlsx");
			FileInputStream stream = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(stream);
			Sheet sheet = wb.getSheet("Data");
			Row row = sheet.getRow(1);
			Cell cell = row.getCell(0);
			String data = cell.getStringCellValue();

			if (data.equals("Francis")) {
				cell.setCellValue("Kennedy");
			}
			Row row2 = sheet.getRow(1);
			Cell cell2 = row2.getCell(3);
			double numvalue = cell2.getNumericCellValue();
			long ln = (long) numvalue;
			String valueOf = String.valueOf(ln); 
			
			if (valueOf.equals("9988776655")){
				cell2.setCellValue("8248374261");				
				
			}
			
			FileOutputStream stream1 = new FileOutputStream(file);
			wb.write(stream1);
			System.out.println("Excel value updated");
			
			
}
}
