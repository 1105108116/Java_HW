import java.io.*;

public class HW16 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		Student s = new Student();
		System.out.print("請輸入學生名稱：");
		s.setName(buf.readLine());
		System.out.print("請輸入學生年齡：");
		s.setAge(Integer.parseInt(buf.readLine()));
		System.out.print("請輸入學生身高：");
		s.setHeight(Integer.parseInt(buf.readLine()));
		System.out.print("請輸入學生體重：");
		s.setWeight(Integer.parseInt(buf.readLine()));
		System.out.print("請輸入學生學號：");
		s.setSid(buf.readLine());
		System.out.print("請輸入學生就讀科系：");
		s.setMajor(buf.readLine());
		System.out.print("請輸入學生累積修習學分數：");
		s.setCredit(Integer.parseInt(buf.readLine()));

		s.showProfile();
	}
}
