import java.io.*;

public class HW15_2 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		Student2 s = new Student2();
		System.out.print("�п�J�ǥͦW�١G");
		s.set_name(buf.readLine());
		System.out.print("�п�J�����ơG");
		s.set_ch_score(Integer.parseInt(buf.readLine()));
		System.out.print("�п�J�^����ơG");
		s.set_en_score(Integer.parseInt(buf.readLine()));
		System.out.print("�п�J�ƾǤ��ơG");
		s.set_math_score(Integer.parseInt(buf.readLine()));
		
		s.calAverage(s.get_ch_score(), s.get_en_score(), s.get_math_score());
		s.showProfile();
	}

}
