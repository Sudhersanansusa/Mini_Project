package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_write {
	
	public static void write_data() throws Throwable {
		
		File A = new File("C:\\Users\\sudhe\\Susa\\MavenProject\\Book1.xlsx");
		
		FileInputStream B = new FileInputStream(A);
		
		Workbook C = new XSSFWorkbook(B);
		
		Sheet createSheet = C.createSheet("Details_01");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createCell = createRow.createCell(0);
		
		createCell.setCellValue("Dhoni");
		
		C.getSheet("Details_01").getRow(0).createCell(1).setCellValue("07");
		
		C.getSheet("Details_01").createRow(1).createCell(0).setCellValue("Rohit");
		
		C.getSheet("Details_01").getRow(1).createCell(1).setCellValue("45");
		
		C.getSheet("Details_01").createRow(2).createCell(0).setCellValue("Virat");
		
		C.getSheet("Details_01").getRow(2).createCell(1).setCellValue("18");
		
		FileOutputStream D = new FileOutputStream(A);
		
		C.write(D);
		
		C.close();
	}
	
	public static void main(String[] args) throws Throwable {
		
		write_data();
		
	}

}
