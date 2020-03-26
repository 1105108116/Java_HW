import java.io.*;
public class HW3_2 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int month,date,m_error=0,d_error=0;
		String star_sign=null;
		do {
			if(m_error>0) {
				System.out.println("�п�J���T�����");
			}
			System.out.print("��J����G");
			month = Integer.parseInt(buf.readLine());
			m_error++;
		}while(month>13 || month<1);
		do {
			if(d_error>0) {
				System.out.println("�п�J���T�����");
			}
			System.out.print("��J����G");
			date = Integer.parseInt(buf.readLine());
			d_error++;
		}while(date>31 || date<1);
		
		switch(month) {
		case 1 :
			if(date>21) star_sign="���~�y";
			else star_sign="���~�y";
			break;
		case 2 :
			if(date>29) System.out.print("�п�J���T�����");
			if(date>19)	star_sign="�����y";
			else star_sign="���~�y";
			break;
		case 3 :
			if(date>20) star_sign="�d�Ϯy";
			else star_sign="�����y";
			break;
		case 4 :
			if(date>30) System.out.print("�п�J���T�����");
			if(date>20) star_sign="�����y";
			else star_sign="�d�Ϯy";
			break;
		case 5 :
			if(date>20) star_sign="���l�y";
			else star_sign="�����y";
			break;
		case 6 :
			if(date>30) System.out.print("�п�J���T�����");
			if(date>20) star_sign="���ɮy";
			else star_sign="���l�y";
			break;
		case 7 :
			if(date>22) star_sign="��l�y";
			else star_sign="���ɮy";
			break;
		case 8 :
			if(date>22) star_sign="�B�k�y";
			else star_sign="��l�y";
			break;
		case 9 :
			if(date>30) System.out.print("�п�J���T�����");
			if(date>22) star_sign="�ѯ��y";
			else star_sign="�B�k�y";
			break;
		case 10 :
			if(date>22) star_sign="���Ȯy";
			else star_sign="�ѯ��y";
			break;
		case 11 :
			if(date>30) System.out.print("�п�J���T�����");
			if(date>22) star_sign="�g��y";
			else star_sign="���Ȯy";
			break;
		case 12 :
			if(date>22) star_sign="���~�y";
			else star_sign="�g��y";
			break;
		}
		System.out.print("�z���P�y���G"+star_sign);
	}
}
