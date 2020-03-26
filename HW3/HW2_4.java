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
		System.out.print("輸入姓名：");
		name = buf.readLine();
		System.out.print("輸入身高（公分）：");
		height =Float.parseFloat(buf.readLine());
		System.out.print("輸入體重（公斤）：");
		weight =Float.parseFloat(buf.readLine());
		BMI = weight /(height*height/10000);
		System.out.print("姓名："+name+"\n身高："+height+"公分"+"\n體重："+weight+"公斤"+"\nBMI值："+BMI);
	}


}
