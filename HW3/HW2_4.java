import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HW2_4 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf;
		String name;
		float height,weight, BMI;
		buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("��J�m�W�G");
		name = buf.readLine();
		System.out.print("��J�����]�����^�G");
		height =Float.parseFloat(buf.readLine());
		System.out.print("��J�魫�]����^�G");
		weight =Float.parseFloat(buf.readLine());
		BMI = weight /(height*height/10000);
		System.out.print("�m�W�G"+name+"\n�����G"+height+"����"+"\n�魫�G"+weight+"����"+"\nBMI�ȡG"+BMI);
	}


}
