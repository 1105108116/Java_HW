import java.io.*;
import java.text.NumberFormat;
public class HW3_1 {
	public static void main (String[] args) throws IOException
	{
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(1); 
		BufferedReader buf;
		String name,ID,result,level = null;
		char sex;
		int year,age;
		float height,weight, BMI;
		buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("輸入姓名：");
		name = buf.readLine();
		System.out.print("輸入身分證字號：");
		ID = buf.readLine();
		sex= ID.charAt(1);
		System.out.print("輸入出生年（西元）：");
		year =Integer.parseInt(buf.readLine());
		age = 2019 - year;
		System.out.print("輸入身高（公分）：");
		height =Float.parseFloat(buf.readLine());
		System.out.print("輸入體重（公斤）：");
		weight =Float.parseFloat(buf.readLine());
		BMI = weight /(height*height/10000);
		
		switch(sex) {
		case '1':
			if(age>12) 	level = "先生";
			else level = "小弟";
			break;
		case '2':
			if(age>12)  level = "小姐";
			else level = "小妹";
			break;
		}
		
		if(BMI>=35) {
			result="重度肥胖";
		}else if(BMI>=30) {
			result="中度肥胖";
		}else if(BMI>=27) {
			result="輕度肥胖";
		}else if(BMI>=24) {
			result="過重";
		}else if(BMI>=18.5) {
			result="正常範圍";
		}else {
			result="體重過輕";
		}
		System.out.print(name+" "+level+"，您的年齡是"+age+"歲，您的BMI值為"+nf.format(BMI)+"您的身體狀況為："+result+"。");
	}


}
