import java.io.*;
import java.lang.Math;
public class HW6_2 {
	public static void main (String[] args) throws IOException
	{
		int i,m_max,e_max,c_max,F=0,P=0,line;
		char c;
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入一個正整數：");
		line=Integer.parseInt(buf.readLine());
		System.out.print("請輸入一個符號：");
		String str=buf.readLine();
		c=str.charAt(0);
		
		System.out.print("請輸入學生人數：");
		i=Integer.parseInt(buf.readLine());
		
		int math[] = new int[i];
		int eng[] = new int[i];
		int com[] = new int[i];
		float averge[] = new float[i];
		for(int r = 0;r<i;r++) {
			math[r]=(int)(Math.random()*(70+1)+30);
			eng[r]=(int)(Math.random()*(70+1)+30);
			com[r]=(int)(Math.random()*(70+1)+30);
		}
		m_max=math[0];
		e_max=eng[0];
		c_max=com[0];
		for(int a=0;a<averge.length;a++) {
			if(math[a]>m_max) {
				m_max = math[a];
			}
			if(eng[a]>e_max) {
				e_max = eng[a];
			}
			if(com[a]>c_max) {
				c_max = com[a];
			}
			averge[a] = (float)(math[a]+eng[a]+com[a])/3;
			if(averge[a]>=60) {
				P++;
			}else F++;
		}
		System.out.println("\t學號\t計概\t數學\t英文\t平均");
		line(line,c);
		show(i,com,math,eng,averge);
		System.out.println("計概最高分為"+c_max+"，數學最高分為"+m_max+"，英文最高分為"+e_max+"\n總平均不及格有"+F+"筆，總平均及格有"+P+"筆");
	}
	public static void line(int len,char type) {
		for(int i = 0;i<len;i++) {
			System.out.print(type);
		}
		System.out.println();
	}
	public static void show(int number,int c_score[],int m_score[],int e_score[],float a_score[]) {
		for(int j=1;j<=number;j++) {
			System.out.println("\t"+j+"\t"+c_score[j-1]+"\t"+m_score[j-1]+"\t"+e_score[j-1]+"\t"+a_score[j-1]);
		}
	}
}
