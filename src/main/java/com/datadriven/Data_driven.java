package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.All;

public class Data_driven {
	
	public static void All_data() throws Throwable {
		
		System.out.println("All Data");
		
		File A =  new File("C:\\Users\\sudhe\\Susa\\MavenProject\\Book1.xlsx");
		
		FileInputStream B = new FileInputStream(A);
		
		Workbook C = new XSSFWorkbook(B);
		
		org.apache.poi.ss.usermodel.Sheet sheetAt = C.getSheetAt(0);
		
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < physicalNumberOfRows ; i++) {
			
			Row row = sheetAt.getRow(i);
			
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < physicalNumberOfCells ; j++) {
				
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(cellType.STRING)) {
					
					String stringCellValue = cell.getStringCellValue();
					
					System.out.println(stringCellValue);
					
				}
				
				else if (cellType.equals(cellType.NUMERIC)) {
					
					double numericCellValue = cell.getNumericCellValue();
					
					int num = (int) numericCellValue;
					
					System.out.println(num);
					
				}
			
			}
			
		}	
		
	}
	
	public static void main(String[] args) throws Throwable {
		
	All_data();

	}

	}

	


