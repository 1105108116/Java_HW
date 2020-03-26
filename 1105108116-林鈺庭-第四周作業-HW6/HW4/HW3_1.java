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
		System.out.print("��J�m�W�G");
		name = buf.readLine();
		System.out.print("��J�����Ҧr���G");
		ID = buf.readLine();
		sex= ID.charAt(1);
		System.out.print("��J�X�ͦ~�]�褸�^�G");
		year =Integer.parseInt(buf.readLine());
		age = 2019 - year;
		System.out.print("��J�����]�����^�G");
		height =Float.parseFloat(buf.readLine());
		System.out.print("��J�魫�]����^�G");
		weight =Float.parseFloat(buf.readLine());
		BMI = weight /(height*height/10000);
		
		switch(sex) {
		case '1':
			if(age>12) 	level = "����";
			else level = "�p��";
			break;
		case '2':
			if(age>12)  level = "�p�j";
			else level = "�p�f";
			break;
		}
		
		if(BMI>=35) {
			result="���תέD";
		}else if(BMI>=30) {
			result="���תέD";
		}else if(BMI>=27) {
			result="���תέD";
		}else if(BMI>=24) {
			result="�L��";
		}else if(BMI>=18.5) {
			result="���`�d��";
		}else {
			result="�魫�L��";
		}
		System.out.print(name+" "+level+"�A�z���~�֬O"+age+"���A�z��BMI�Ȭ�"+nf.format(BMI)+"�z�����骬�p���G"+result+"�C");
	}


}
