package com.zeratul;

import java.io.FileInputStream;
import java.io.InputStream;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;

public class app {

	public static void main(String[] args) {
		Workbook readwb=null;
		  try    
	        {   
	            //����Workbook����, ֻ��Workbook����   
	  
	            //ֱ�Ӵӱ����ļ�����Workbook   
	  
	            InputStream instream = new FileInputStream("C:/Users/zhangyl/Desktop/test.xls");   
	  
	            readwb = Workbook.getWorkbook(instream);   
	  
	            //Sheet���±��Ǵ�0��ʼ   
	  
	            //��ȡ��һ��Sheet��   
	  
	            Sheet readsheet = readwb.getSheet(0);   
	  
	            //��ȡSheet������������������   
	  
	            int rsColumns = readsheet.getColumns();   
	  
	            //��ȡSheet������������������   
	  
	            int rsRows = readsheet.getRows();   
	  
	            //��ȡָ����Ԫ��Ķ�������   
	  
	            for (int i = 0; i < rsRows; i++)   
	  
	            {   
	  
	                for (int j = 0; j < rsColumns; j++)   
	  
	                {   
	  
	                    Cell cell = readsheet.getCell(j, i);   
	 
	                    if(j==0){
	                    	System.out.print(cell.getContents() + ':');   
	                    }else{
	                    	if(cell.getContents().isEmpty()){
	                    		System.out.print("\"en\""+ ',');
	                    	}else{
	                    		System.out.print('\"'+cell.getContents()+'\"' + ',');
	                    	}
	                    	   
	                    }
	                    
	  
	                }   
	            }    
	  
	        } catch (Exception e) {   
	  
	            e.printStackTrace();   
	  
	        } finally {   
	  
	            readwb.close();   
	  
	        }   
	  
	}

}
