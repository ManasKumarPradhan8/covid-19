package com.tripadviser.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUTIL {
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;

	public static int getRowCount(String Xlfile, String Xlsheet) throws IOException {
		fi = new FileInputStream(Xlfile);
		wb = new XSSFWorkbook();
		ws = wb.getSheet(Xlsheet);
		int rowcount = ws.getLastRowNum();
		System.out.println("");
		fi.close();
		return rowcount;
	}

	public static String getCellCount(String Xlfile, String Xlsheet, int rownum, int colnum)
			throws FileNotFoundException {
		fi = new FileInputStream(Xlfile);
		wb = new XSSFWorkbook();
		ws = wb.getSheet(Xlsheet);
		row = ws.getRow(rownum);
		cell = row.getCell(colnum);
		String data;
		try {
			DataFormatter formatter = new DataFormatter();
			String celldata = formatter.formatCellValue(cell);
			return celldata;
		} catch (Exception e) {
			data = "KUKURA MANAS YOU DON'T KNOW HOW TO GIVE PATH...";
		}
		return data;

	}

	public static void setCellData(String Xlfile, String Xlsheet, int rownum, int column, String data)
			throws IOException {
		fi = new FileInputStream(Xlfile);
		wb = new XSSFWorkbook();
		ws = wb.getSheet(Xlsheet);
		row = ws.getRow(rownum);
		cell = row.createCell(column);
		cell.setCellValue(data);
		fo = new FileOutputStream(Xlfile);
		wb.write(fo);
		fi.close();
		fo.close();

	}
}