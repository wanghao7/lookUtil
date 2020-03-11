package com.wanghao.Utils;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
  *  流处理工具类
 * @author hp
 *
 */
public class StreamUtil {

	/*
	* 方法1：批量关闭流，参数能传入无限个。
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭，并且参数个数不限。
	*/
	public static void closeAll(Closeable... io){
		
		for(Closeable temp:io) {
			try {
				if(temp!=null) {
					temp.close();
				}
			} catch (Exception e) {
				
			}
		}
	}
	
	
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容
	*/
	public static String readTextFile(FileInputStream src) throws IOException{
		InputStreamReader reader = new InputStreamReader(src);
//		int read = src.read();
		BufferedReader reader2 = new BufferedReader(reader);
		String readLine = reader2.readLine();
		if(readLine!=null) {
			readLine+=reader2.readLine();
		}
		closeAll(reader2,reader);//调用方法1
		return readLine;
	}
	
	/*
	* 方法3：传入文本文件对象，返回该文件内容(10分)，并且要求内部调用上面第2个方法* 这是典型的方法重载，记住了吗？少年…
	*/
	@SuppressWarnings("resource")
	public static String readTextFile(File txtFile) throws Exception{

		FileInputStream fileInputStream = new FileInputStream(txtFile);
		String readTextFile = readTextFile(fileInputStream);//调用方法2
		return readTextFile;
	}
}
