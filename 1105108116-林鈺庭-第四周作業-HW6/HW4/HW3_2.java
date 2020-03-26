import java.io.*;
public class HW3_2 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int month,date,m_error=0,d_error=0;
		String star_sign=null;
		do {
			if(m_error>0) {
				System.out.println("請輸入正確的日期");
			}
			System.out.print("輸入月份：");
			month = Integer.parseInt(buf.readLine());
			m_error++;
		}while(month>13 || month<1);
		do {
			if(d_error>0) {
				System.out.println("請輸入正確的日期");
			}
			System.out.print("輸入日期：");
			date = Integer.parseInt(buf.readLine());
			d_error++;
		}while(date>31 || date<1);
		
		switch(month) {
		case 1 :
			if(date>21) star_sign="水瓶座";
			else star_sign="摩羯座";
			break;
		case 2 :
			if(date>29) System.out.print("請輸入正確的日期");
			if(date>19)	star_sign="雙魚座";
			else star_sign="水瓶座";
			break;
		case 3 :
			if(date>20) star_sign="牡羊座";
			else star_sign="雙魚座";
			break;
		case 4 :
			if(date>30) System.out.print("請輸入正確的日期");
			if(date>20) star_sign="金牛座";
			else star_sign="牡羊座";
			break;
		case 5 :
			if(date>20) star_sign="雙子座";
			else star_sign="金牛座";
			break;
		case 6 :
			if(date>30) System.out.print("請輸入正確的日期");
			if(date>20) star_sign="巨蟹座";
			else star_sign="雙子座";
			break;
		case 7 :
			if(date>22) star_sign="獅子座";
			else star_sign="巨蟹座";
			break;
		case 8 :
			if(date>22) star_sign="處女座";
			else star_sign="獅子座";
			break;
		case 9 :
			if(date>30) System.out.print("請輸入正確的日期");
			if(date>22) star_sign="天秤座";
			else star_sign="處女座";
			break;
		case 10 :
			if(date>22) star_sign="天蠍座";
			else star_sign="天秤座";
			break;
		case 11 :
			if(date>30) System.out.print("請輸入正確的日期");
			if(date>22) star_sign="射手座";
			else star_sign="天蠍座";
			break;
		case 12 :
			if(date>22) star_sign="摩羯座";
			else star_sign="射手座";
			break;
		}
		System.out.print("您的星座為："+star_sign);
	}
}
