import java.io.*;
public class HW16_3 {
	public static void main (String[] args)throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		Employee e = new Employee("小林",21,(short)108,"55688","CSIE",25000);
		e.showProfile();
		Faculty f = new Faculty("小林",21,(short)108,"55688","a",25000,null);
		System.out.print("\n輸入專任教師級職：");
		f.setPosition(buf.readLine());
		f.showProfile();
	}
}
