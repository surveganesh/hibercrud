package com.java.util;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
		
/**
 * 
 * This is for excel read write demo
 *
 *This is demo
 */
		public class ReadfromExcelUtil {
				@SuppressWarnings("deprecation")
				public static Object[][] getTestData(){
				
					
					//C:\Users\Yogesh\Documents\demo.xlsx
					//HSSFworkbook  -POi -- 2007
					//XSSFWorkbook --poi ooxml  -- 2007 and onwards
					Object [][] testData = new Object[7][3];
					int rowCount=0;
					int columnCount=0;
					boolean flag=true;
					XSSFWorkbook workbook=null;
					try {
						workbook = new XSSFWorkbook("D:\\JP\\hibercrud\\usertestdata.xlsx");
						XSSFSheet sheet = workbook.getSheet("data");//workbook.getSheetAt(2);
						Iterator<Row> rows = sheet.rowIterator();
						
						while(rows.hasNext()){
								Row row = rows.next();
								if(flag==true){
									flag=false;
									continue;
								}
								Iterator<Cell> cells = row.cellIterator();
										while(cells.hasNext()){
											Cell cell = cells.next();
											if(cell.getCellType()==1){
												testData[rowCount][columnCount]=cell.getStringCellValue();
												columnCount++;
												//System.out.print("\t "+cell.getStringCellValue());	
											}
											
										}
										System.out.println("\n");
										rowCount++;
										columnCount=0;
						}
					} catch (Exception e) {
						e.printStackTrace();
					}finally{
						if(workbook!=null)
							try {
								workbook.close();
							} catch (IOException e) {
								e.printStackTrace();
							}
					}
					
					
					
					return testData;
				}
		}



//demo comment