package com.datadriven;

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

public class DataDriven_Write {

	public static void data_write() throws IOException {
		File f = new File("C:\\Users\\TACTV\\eclipse-workspace\\Maven_Project\\SCV ID LIST.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet createSheet = w.createSheet("karthick");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("mahesh");
		
		w.getSheet("karthick").getRow(0).createCell(1).setCellValue("karthick");
		w.getSheet("karthick").createRow(1).createCell(0).setCellValue("indra");
		w.getSheet("karthick").getRow(1).createCell(1).setCellValue("mahikarthii");
		
		FileOutputStream fos=new FileOutputStream(f);
		
	 w.write(fos);

	}
public static void main(String[] args) throws IOException {
	data_write();
	
}
}
