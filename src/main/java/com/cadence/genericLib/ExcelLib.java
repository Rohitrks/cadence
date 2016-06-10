package com.cadence.genericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelLib  {

	 String ExcelSheetPath = System.getProperty("user.dir");
	 Logger LOGGER = Logger.getLogger( ExcelLib .class.getName());
	     	
	public  String getExcelData(String sheetName,int rowNum,int colNum) throws InvalidFormatException, IOException{
		
		FileInputStream fis=new FileInputStream(ExcelSheetPath+File.separator+File.separator+"src"+File.separator+File.separator+"main"+File.separator+File.separator+"resources"+File.separator+File.separator+"TestData.xls");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row rw=sh.getRow(rowNum);
		String name = "";
		name=rw.getCell(colNum).getStringCellValue();	
		return name;
		}
	
	public static String getInstanceId(String sheetName,int rowNum,int colNum){

		FileInputStream fis;
		Workbook wb = null;
		String ExcelSheetPath = System.getProperty("user.dir");
		try {
			fis = new FileInputStream(ExcelSheetPath+File.separator+File.separator+"src"+File.separator+File.separator+"main"+File.separator+File.separator+"resources"+File.separator+File.separator+"TestData.xls");

			wb = WorkbookFactory.create(fis);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sh=wb.getSheet(sheetName);
		Row rw=sh.getRow(rowNum);
		final String name = rw.getCell(colNum).getStringCellValue();
		return name;
	}
	
	public void setExcelData(String sheetName,int rowNum,int colNum,String setName) throws InvalidFormatException, IOException{
		
		FileInputStream fis=new FileInputStream(ExcelSheetPath+File.separator+File.separator+"src"+File.separator+File.separator+"main"+File.separator+File.separator+"resources"+File.separator+File.separator+"TestData.xls");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row rw=sh.getRow(rowNum);
		Cell cell=rw.createCell(colNum);
		cell.setCellType(Cell.CELL_TYPE_STRING);
		cell.setCellValue(setName);
		FileOutputStream fos=new FileOutputStream(ExcelSheetPath+File.separator+File.separator+"src"+File.separator+File.separator+"main"+File.separator+File.separator+"resources"+File.separator+File.separator+"TestData.xls");
		wb.write(fos);
		}
	
	public int getExcelRowCount(String sheetName) throws InvalidFormatException, IOException{
		
		FileInputStream fis=new FileInputStream(ExcelSheetPath+File.separator+File.separator+"src"+File.separator+File.separator+"main"+File.separator+File.separator+"resources"+File.separator+File.separator+"TestData.xls");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		int rwCount=sh.getLastRowNum();
		//LOGGER.info(rwCount);
		return rwCount;
		
		
	}
}
