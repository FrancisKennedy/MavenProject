package org.excelfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\franciskenny\\eclipse-workspace\\"
				+ "MavenProject\\ExcelFolder\\excelnew.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(stream);
		Sheet sheet = wb.getSheet("data");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);		
			System.out.println("****************");
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				
				if (cellType ==1) {
					String string = cell.getStringCellValue();
					System.out.println(string);
			}
										
				if (cellType ==0) {
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat dateformate = new SimpleDateFormat("DD-MMM-YYYY");
						String format = dateformate.format(dateCellValue);
						System.out.println(format);
					}
					
				 else {
					double db = cell.getNumericCellValue();
					long l = (long) db;
					String valueOf = String.valueOf(l);
				 }
				}
			
				
			} 
			
			
		}

}	
	
}


