import java.io.*;

public class HW15_1 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		Student s = new Student(null, 0, 0, 0);
		System.out.print("�п�J�ǥͦW�١G");
		s.name = buf.readLine();
		System.out.print("�п�J�����ơG");
		s.ch_score = Integer.parseInt(buf.readLine());
		System.out.print("�п�J�^����ơG");
		s.en_score = Integer.parseInt(buf.readLine());
		System.out.print("�п�J�ƾǤ��ơG");
		s.math_score = Integer.parseInt(buf.readLine());
		
		s.calAverage(s.ch_score, s.en_score, s.math_score);
		s.showProfile();
	}

}
