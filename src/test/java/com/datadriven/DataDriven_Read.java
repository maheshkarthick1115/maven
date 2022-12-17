package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Read {
	

	public static void all() throws IOException {
		System.out.println("***ALL DATA***");
		File f = new File("C:\\Users\\TACTV\\eclipse-workspace\\Maven_Project\\SCV ID LIST.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(1);
		int NumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < NumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int NumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < NumberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String CellValue = cell.getStringCellValue();
					System.out.print(CellValue+" ");
				} else if (cellType.equals(CellType.NUMERIC)) {
					double Value = cell.getNumericCellValue();
					int num = (int) Value;
					System.out.print(num+" ");
				}
			}	System.out.println('\n');
		}
		
	}

	public static void particular_data() throws IOException {
		System.out.println("***PARTICULAR Data***");
		File f = new File("C:\\Users\\TACTV\\eclipse-workspace\\Maven_Project\\SCV ID LIST.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(1);
		Row row = sheetAt.getRow(0);
		Cell cell = row.getCell(2);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			String Value = cell.getStringCellValue();
			System.out.println(Value);
		} else if (cellType.equals(CellType.NUMERIC)) {
			double value = cell.getNumericCellValue();
			int num = (int) value;
			System.out.println(num);
		}
	}

	public static void particular_row() throws IOException {
		System.out.println("****PARTICULAR ROW****");
		File f = new File("C:\\Users\\TACTV\\eclipse-workspace\\Maven_Project\\SCV ID LIST.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(1);
		Row row = sheetAt.getRow(4);
		int NumberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < NumberOfCells; i++) {
			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();

			if (cellType.equals(cellType.STRING)) {
				String Value = cell.getStringCellValue();
				System.out.print(Value+" ");
			} else if (cellType.equals(CellType.NUMERIC)) {
				double value = cell.getNumericCellValue();
				int num = (int) value;
				System.out.print(num+" ");
			}
		
		}	System.out.println('\n');
	}

	public static void particular_colum() throws IOException {
		System.out.println("****particular_column****");
		File f = new File("C:\\Users\\TACTV\\eclipse-workspace\\Maven_Project\\SCV ID LIST.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(1);
		int NumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < NumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(0);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String CellValue = cell.getStringCellValue();
				System.out.println(CellValue);
			} else if (cellType.equals(CellType.NUMERIC)) {
				double Value = cell.getNumericCellValue();
				int num = (int) Value;
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		all();
		particular_data();
		particular_row();
	
		particular_colum();

	}

}
