import java.io.*;
public class HW3_4 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int min,max,base,number;
		System.out.print("��J�d�򪺳̤p�ơG");
		min = Integer.parseInt(buf.readLine());
		System.out.print("��J�d�򪺳̤j�ơG");
		max = Integer.parseInt(buf.readLine());
		System.out.print("��J�n�M�䭿�ƪ���ơG");
		base = Integer.parseInt(buf.readLine());
		number = min;
		System.out.print(base+"�����Ƭ��G");
		while(true) {
			if(number>max) break;
			number++;
			if(number%base==0) {
				System.out.print(number+" ");
			}else {
				continue;
			}
		}
	
	}
}
