package org.excelfile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\franciskenny\\eclipse-workspace\\"
				+ "MavenProject\\ExcelFolder\\framework.xlsx");
		FileOutputStream stream = new FileOutputStream(file);
		
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Data");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("framework");
		workbook.write(stream);
		System.out.println("Excel Write Values: "+ cell);
//		for (int i = 0; i < 1 ;i++) {
//			Row row = sheet.createRow(i);
//			
//		for (int j = 0; j < 1; j++) {
//			Cell cell = row.createCell(j);
//				cell.setCellValue(j);
//			System.out.println(j);
//			
//		}	
//			
//		}
	}

}
