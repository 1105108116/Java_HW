import java.io.*;

public class HW15_2 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		Student2 s = new Student2();
		System.out.print("請輸入學生名稱：");
		s.set_name(buf.readLine());
		System.out.print("請輸入國文分數：");
		s.set_ch_score(Integer.parseInt(buf.readLine()));
		System.out.print("請輸入英文分數：");
		s.set_en_score(Integer.parseInt(buf.readLine()));
		System.out.print("請輸入數學分數：");
		s.set_math_score(Integer.parseInt(buf.readLine()));
		
		s.calAverage(s.get_ch_score(), s.get_en_score(), s.get_math_score());
		s.showProfile();
	}

}
