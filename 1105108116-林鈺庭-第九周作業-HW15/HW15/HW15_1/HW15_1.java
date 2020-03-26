import java.io.*;

public class HW15_1 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		Student s = new Student(null, 0, 0, 0);
		System.out.print("請輸入學生名稱：");
		s.name = buf.readLine();
		System.out.print("請輸入國文分數：");
		s.ch_score = Integer.parseInt(buf.readLine());
		System.out.print("請輸入英文分數：");
		s.en_score = Integer.parseInt(buf.readLine());
		System.out.print("請輸入數學分數：");
		s.math_score = Integer.parseInt(buf.readLine());
		
		s.calAverage(s.ch_score, s.en_score, s.math_score);
		s.showProfile();
	}

}
