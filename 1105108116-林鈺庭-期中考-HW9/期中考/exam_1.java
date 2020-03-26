package mid_exam;
import java.io.*;
public class exam_1 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String name,password;
		int year,month,date;
		
		System.out.print("輸入姓名：");
		name = buf.readLine();
		System.out.print("輸入出生年份：");
		year = Integer.parseInt(buf.readLine());
		System.out.print("輸入出生月份：");
		month = Integer.parseInt(buf.readLine());
		System.out.print("輸入出生日期：");
		date = Integer.parseInt(buf.readLine());
		System.out.print("輸入密碼：");
		password = buf.readLine();
		
		System.out.println(name + "您好，歡迎您開始使用本密碼管理程式，您的出生年月日為" + year + "年" + month + "月" + date + "日，您的密碼長度為"+password.length()+"。");
	}

}
