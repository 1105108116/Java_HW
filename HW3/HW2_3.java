import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW2_3 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
		int length,width,height,perimeter,surface_area,volume;
		System.out.print("輸入長（公分/整數）：");
		length = Integer.parseInt(buf.readLine());
		System.out.print("輸入寬（公分/整數）：");
		width = Integer.parseInt(buf.readLine());
		System.out.print("輸入高（公分/整數）：");
		height = Integer.parseInt(buf.readLine());
		
		perimeter = 4*(length+width+height);
		surface_area = 2*(length*width+width*height+height*length);
		volume = width*length*height;
		
		System.out.print("長方體的周長為："+perimeter+"\n長方體的表面積為："+surface_area+"\n長方體的體積為："+volume); 
	}

}
