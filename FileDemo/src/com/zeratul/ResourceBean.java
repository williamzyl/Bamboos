package com.zeratul;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ResourceBean {
	private FileOutputStream fos;
	private File file;
	
	
	private void init(){
		try {
			 System.out.println("ResourceBean:========��ʼ��");  
		        //������Դ,�ڴ�ֻ����ʾ  
		     System.out.println("ResourceBean:========������Դ��ִ��һЩԤ����");  
			fos=new FileOutputStream(file);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	 //������Դ����  
    public void destroy() {  
        System.out.println("ResourceBean:========����");  
        //�ͷ���Դ  
        System.out.println("ResourceBean:========�ͷ���Դ��ִ��һЩ�������");  
        try {  
            fos.close();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }
    }
	
	public ResourceBean() {
	}
	public ResourceBean(FileOutputStream fos, File file) {
		this.fos = fos;
		this.file = file;
	}
	public FileOutputStream getFos() {
		return fos;
	}
	public void setFos(FileOutputStream fos) {
		this.fos = fos;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	
	
	

}
