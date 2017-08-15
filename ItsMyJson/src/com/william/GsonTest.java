package com.william;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import com.google.gson.Gson;
import com.william.bean.Data;
import com.william.bean.Video;

public class GsonTest {

	
	public static void main(String[] args) {
		Gson gson=new Gson();
		StringBuffer fileSb=readFileByLines("C:\\Users\\zhangyl\\Desktop\\HBO.js");
		Data data=gson.fromJson(fileSb.toString(), Data.class);
		Map<String,List<Video>> myData=new HashMap<String,List<Video>>();
		for (Entry<String, List<Video>> entry : data.getData().entrySet()) {  
		    System.out.println("Key = " + entry.getKey() + ", Value  number  = " + entry.getValue().size());  
		    List<Video> list=new ArrayList<Video>();
		    int length=randomNumber(60,40);
		    System.out.println(length);
		    for(int i=0;i<length;i++){
		    	list.add(entry.getValue().get(i));
		    }
		    myData.put(entry.getKey(), list);
		}  
		
		Data newData=new Data();
		newData.setData(myData);
		String jsonStr=gson.toJson(newData);
	
		try {
			
			File file=new File("C:\\Users\\zhangyl\\Desktop\\Data.js");
			if(!file.exists()){
				file.createNewFile();
			}
			FileOutputStream  fop = new FileOutputStream(file);
			// get the content in bytes
			   byte[] contentInBytes = jsonStr.getBytes();

			   fop.write(contentInBytes);
			   fop.flush();
			   fop.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	

		
	}
	
	private static int randomNumber(int max,int min){
		Random random=new Random();
		int s = random.nextInt(max)%(max-min+1) + min;
		return s;
	}
	
	  /**
     * 以行为单位读取文件，常用于读面向行的格式化文件
     */
    @SuppressWarnings("finally")
	public static StringBuffer readFileByLines(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        StringBuffer sb=new StringBuffer();
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                sb.append(tempString);
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                    return sb;
                } catch (IOException e1) {
                	e1.printStackTrace();
                	return null;
                }
            }
            return null;
        }
    }
}
