package day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.wanghao.Utils.DateUtil;
import com.wanghao.Utils.FileUtil;
import com.wanghao.Utils.StreamUtil;

public class CommonTest {

	@Test
	public void testEnd() {
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		Date date1 = DateUtil.getDateByInitMonth(new Date());
		Date date2 = DateUtil.getDateByFullMonth(new Date());
	    String format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date1);
		String format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date2);
		System.out.println(format1);
		System.out.println(format2);
		sql.replace("{1}", format1);
		sql.replace("{2}",format2);
		System.out.println(sql);
	}
	@Test
	public void testDate() {
//		DateUtil dtUtil = new DateUtil();
		Date date = DateUtil.getDateByInitMonth(new Date());
		String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
		System.out.println(format);
	}
	@Test
	public void test2Date() {
//		DateUtil dtUtil = new DateUtil();
		Date date = DateUtil.getDateByFullMonth(new Date());
		String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
		System.out.println(format);
	}
	@Test
	public void testFile() {
//		DateUtil dtUtil = new DateUtil();
		String extendName = FileUtil.getExtendName("aaa.jpg");
		System.out.println(extendName);
	}
	
	@Test
	public void testStream() throws FileNotFoundException, IOException {
		String readTextFile = StreamUtil.readTextFile(new FileInputStream("C:\\Users\\hp\\Desktop/测试.txt"));
		System.out.println(readTextFile);
	}
	
	@Test
	public void testStream2() throws Exception  {
		File file = new File("C:\\Users\\hp\\Desktop/测试.txt");
		String readTextFile = StreamUtil.readTextFile(file);
		System.out.println(readTextFile);
	}
	
}
