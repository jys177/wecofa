package com.wecofa.file.excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

/**
 * ExcelWriter.class
 * Excel File 을  write 하는 클래스이다.
 * poi 4.1.2 version
 * spring-boot-starter-web
 * */
public class ExcelWriter {

    private Workbook workbook;
    
    private Sheet sheet;

    private String extension;

    private int fetchRowSize;

    public void write(){

    }

    private void setSXSSFWorkbook(){
        workbook = new SXSSFWorkbook();
    }

    private void setXSSFWorkbook(FileInputStream fis){
        try{
            workbook = new XSSFWorkbook(fis);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setHSSFWorkbook(FileInputStream fis){
        try {
            workbook= new HSSFWorkbook(fis);
        }catch (IOException ioe){
            ioe.getStackTrace();
        }

    }

}
