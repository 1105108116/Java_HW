import java.io.*;

public class HW16 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		Student s = new Student(null, 0, 0, 0, null, null, null);
		System.out.print("�п�J�ǥͦW�١G");
		s.setName(buf.readLine());
		System.out.print("�п�J�ǥͦ~�֡G");
		s.setAge(Integer.parseInt(buf.readLine()));
		System.out.print("�п�J�ǥͨ����G");
		s.setHeight(Integer.parseInt(buf.readLine()));
		System.out.print("�п�J�ǥ��魫�G");
		s.setWeight(Integer.parseInt(buf.readLine()));
		System.out.print("�п�J�ǥ;Ǹ��G");
		s.sid = buf.readLine();
		System.out.print("�п�J�ǥʹNŪ��t�G");
		s.major = buf.readLine();
		System.out.print("�п�J�ǥͲֿn�ײ߾Ǥ��ơG");
		s.credit = buf.readLine();
		
		s.showProfile();
	}
}
