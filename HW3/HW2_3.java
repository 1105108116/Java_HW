import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW2_3 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
		int length,width,height,perimeter,surface_area,volume;
		System.out.print("��J���]����/��ơ^�G");
		length = Integer.parseInt(buf.readLine());
		System.out.print("��J�e�]����/��ơ^�G");
		width = Integer.parseInt(buf.readLine());
		System.out.print("��J���]����/��ơ^�G");
		height = Integer.parseInt(buf.readLine());
		
		perimeter = 4*(length+width+height);
		surface_area = 2*(length*width+width*height+height*length);
		volume = width*length*height;
		
		System.out.print("�����骺�P�����G"+perimeter+"\n�����骺���n���G"+surface_area+"\n�����骺��n���G"+volume); 
	}

}
