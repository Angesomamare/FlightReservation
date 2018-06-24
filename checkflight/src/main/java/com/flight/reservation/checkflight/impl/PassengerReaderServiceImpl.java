package com.flight.reservation.checkflight.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;

import com.flight.reservation.checkflight.api.PassengerReaderService;
import com.flight.reservation.checkflight.constants.PassengerConstants;
import com.flight.reservation.checkflight.dto.PassengerDTO;

public class PassengerReaderServiceImpl implements PassengerReaderService{
	private static final Logger log = LoggerFactory.getLogger(PassengerReaderServiceImpl.class);
	
	//private  filelocation = "C:\\Users\\Angesom\\Desktop\\practice";
	private static final String FILE_NAME = "C:\\Users\\Angesom\\Desktop\\practice\\Excelfile.xlsx";
	
/*	
	@Autowired
	public PassengerReaderServiceImpl(PassengerDTO dto) {
		this.dto=dto;
	}*/
	
	@SuppressWarnings("deprecation")
	@Override
	public List<PassengerDTO> readPassengerXlsRecords(Resource resource)  
			throws IOException,SecurityException,IllegalAccessException,InvocationTargetException{
		log.info("Inside reading the passenger Xls file!!!!");
		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
		
		Workbook excel = null;
		HSSFWorkbook excelXls = null;
		HSSFSheet sheetXls = null;
		Sheet sheet =null;
		Iterator<Row> rowIterator =null;
	
		List<PassengerDTO> excelDTOList = new ArrayList<PassengerDTO>();
		PassengerDTO passengerDTO = new PassengerDTO();
		Class<?> aClass = passengerDTO.getClass();
		Field[] fields = aClass.getFields();
		FileInputStream file = new FileInputStream(FILE_NAME);
		if (FILE_NAME.indexOf(".xlsx")!=-1) {
			try {
				excel =WorkbookFactory.create(file);
			} catch (InvalidFormatException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			sheet = excel.getSheetAt(PassengerConstants.SHEET_NUMBER_TO_BE_PROCESSED);
			rowIterator = sheet.iterator();	
			
		}
		else {
			excelXls = new HSSFWorkbook(file);
			sheetXls = excelXls.getSheetAt(PassengerConstants.SHEET_NUMBER_TO_BE_PROCESSED);
			rowIterator = sheetXls.iterator();
		}
		while(rowIterator.hasNext()) {
			int countcell = 0;
			PassengerDTO passDTO = new PassengerDTO();
			Row row = rowIterator.next();
			if(row.getRowNum()==0) {
				continue;
			}
			if(row.getPhysicalNumberOfCells()==1 || row.getPhysicalNumberOfCells()==1) {
				continue;
			}
			for(int cn = 0;cn<row.getFirstCellNum();cn++) {
				Cell cell = row.getCell(cn,Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
				if(cell.getColumnIndex()==2) {
					if(cell.getCellType()==0 && cell.getCellType()!=1) {
						Date date = cell.getDateCellValue();
						String formateDate = s.format(date);
						BeanUtils.setProperty(passDTO, fields[countcell].getName(), formateDate.trim());
						countcell ++;
					}
					else {
						cell.setCellType(1);
						BeanUtils.setProperty(passDTO, fields[countcell].getName(), cell.getStringCellValue().trim());
						countcell++;
					}
				}
				else {
					cell.setCellType(1);
					BeanUtils.setProperty(passDTO, fields[countcell].getName(), cell.getStringCellValue().trim());
					countcell++;
				}
				//MissingCellPolicy
			}
			excelDTOList.add(passDTO);
		}
		//excelDTOList = 
	
		
		return excelDTOList;
	}
}
