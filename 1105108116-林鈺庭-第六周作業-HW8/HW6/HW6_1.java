import java.io.*;
public class HW6_1 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int i;
		char c;
		System.out.print("�п�J�@�ӥ���ơG");
		i=Integer.parseInt(buf.readLine());
		System.out.print("�п�J�@�ӲŸ��G");
		String str=buf.readLine();
		c=str.charAt(0);
		line(i,c);
	}
	public static void line(int len,char type) {
		for(int i = 0;i<len;i++) {
			System.out.print(type);
		}
	}
}
