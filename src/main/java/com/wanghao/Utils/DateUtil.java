package com.wanghao.Utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
  *  日期工具类
 * @author hp
 *
 */
public class DateUtil {

	
	/*
	* 方法1：(10分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		//创建日历对象
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(src);
		//设置时间为当月1号
		calendar.set(Calendar.DAY_OF_MONTH,1);
		//将小时至0
		calendar.set(Calendar.HOUR_OF_DAY,0);
		//将分钟至0
		calendar.set(Calendar.MINUTE,0);
		//将秒至0
		calendar.set(Calendar.SECOND,0);
		//将毫秒至0
		calendar.set(Calendar.MILLISECOND,0);
		
//		String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
		
		return calendar.getTime();
	}
	
	/*
	* 方法2：(10分)
	* 给任意一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		//创建日历对象
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(src);
		//设置时间为当月1号
		calendar.set(Calendar.DAY_OF_MONTH,calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		//将小时至0
		calendar.set(Calendar.HOUR_OF_DAY,0);
		//将分钟至0
		calendar.set(Calendar.MINUTE,0);
		//将秒至0
		calendar.set(Calendar.SECOND,0);
		//将毫秒至0
		calendar.set(Calendar.MILLISECOND,0);
		
		return calendar.getTime();
		
	}
}
