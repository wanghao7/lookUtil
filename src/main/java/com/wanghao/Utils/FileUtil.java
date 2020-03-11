package com.wanghao.Utils;
/**
  *  文件工具类
 * @author hp
 *
 */
public class FileUtil {

	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”
	*/
	public static String getExtendName(String fileName){
		//查找最后.的索引
		int lastIndexOf = fileName.lastIndexOf(".");
		
		//字符串截取并返回
		String hou = fileName.substring(lastIndexOf, fileName.length());
		
		return hou;
	}
}
