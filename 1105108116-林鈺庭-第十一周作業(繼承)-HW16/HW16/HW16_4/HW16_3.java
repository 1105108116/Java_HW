import java.io.*;
public class HW16_3 {
	public static void main (String[] args)throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		Employee e = new Employee("�p�L",21,(short)108,"55688","CSIE",25000);
		e.showProfile();
		Faculty f = new Faculty("�p�L",21,(short)108,"55688","a",25000,null);
		System.out.print("\n��J�M���Юv��¾�G");
		f.setPosition(buf.readLine());
		f.showProfile();
	}
}
