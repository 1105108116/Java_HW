import java.io.*;
import java.lang.Math;
public class HW6_3 {
	public static void main (String[] args) throws IOException
	{
		int i,action,student;
		char subject;
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
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
		for(int a=0;a<averge.length;a++) {
			averge[a]=averge(math[a],com[a],eng[a]);
		}		
		while(true) {
			System.out.print("1)顯示每個學生的全部成績。\n2)列出不及格的同學以及分數。\n3)顯示各個分數組距的人數。\n4)查詢某一學號的成績。\n5)列出最高與最低分。\n請選擇要查詢的資料：");
			action=Integer.parseInt(buf.readLine());
			switch(action) {
				case 1:
					show_all(i,com,math,eng,averge);
					break;
				case 2:
					Fail(averge);
					break;
				case 3:
					GD(i,com,math,eng,averge);
					break;
				case 4:
					System.out.println("輸入欲查詢學生的學號：");
					student=Integer.parseInt(buf.readLine());
					show(student,com[student],math[student],eng[student],averge[student]);
					break;
				case 5:
					System.out.println("輸入欲查詢之科目：（a、計概，b、數學，c、英文，d、平均）");
					String sub=buf.readLine();
					student=sub.charAt(0);
					if(student=='a') {
						minmax(com);
					}
					if(student=='b') {
						minmax(math);
					}
					if(student=='c') {
						minmax(eng);
					}
					if(student=='d') {
						minmax(averge);
					}
					break;
			}		
		}
	}
	
	public static float averge(int math,int com,int eng) {
		float averge = (float)(math+com+eng)/3;
		return averge;
		
	}
	public static void GD(int number,int c_score[],int m_score[],int e_score[],float a_score[]) {
		String[][] form = new String[5][11];
		int[][] count=new int [4][10];
		form[0][0]="科目＼級距人數　";
		form[0][1]="0~10";
		form[0][2]="10~20";
		form[0][3]="20~30";
		form[0][4]="30~40";
		form[0][5]="40~50";
		form[0][6]="50~60";
		form[0][7]="60~70";
		form[0][8]="70~80";
		form[0][9]="80~90";
		form[0][10]="90~100";
		form[1][0]="　　　　計概　　　　";
		form[2][0]="　　　　數學　　　　";
		form[3][0]="　　　　英文　　　　";
		form[4][0]="　　　　平均　　　　";
		for(int i=0;i<4;i++) {
			for(int j=0;j<10;j++) {
				count[i][j]=0;
			}
		}
		for(int s=0;s<number;s++) {
			if(c_score[s]<100) {
				count[0][(c_score[s])/10]++;
			}
			if(m_score[s]<100) {
				count[1][(m_score[s])/10]++;
			}
			if(e_score[s]<100) {
				count[2][(e_score[s])/10]++;
			}
			if(a_score[s]<100) {
				count[3][(int)(a_score[s])/10]++;
			}
			if(c_score[s]==100) {
				count[0][9]++;
			}
			if(m_score[s]==100) {
				count[1][9]++;
			}
			if(e_score[s]==100) {
				count[2][9]++;
			}
			if(a_score[s]==100) {
				count[3][9]++;
			}
		}
		for(int f=0;f<11;f++) {
			System.out.print(form[0][f]+"\t");
		}
		
		System.out.println("\n--------------------------------------------------------------------------------------------------");
		for(int r=0;r<5;r++) {
			if(r<4) {
				System.out.print(form[r+1][0]+"\t");
			}
			for(int c=0;c<10;c++) {
				if(r<4) {
					System.out.print(count[r][c]+"\t");
				}
			}
			System.out.println();
		}
	}
	public static void minmax(int subject[]) {
		int max=subject[0];
		int min=subject[0];
		for(int i=1;i<subject.length;i++) {
			if(subject[i]>max) {
				max=subject[i];
			}
			if(subject[i]<min) {
				min=subject[i];
			}
		}
		System.out.println("該科目最高分為："+max+"分，最低分為："+min+"分。");
	}
	public static void Fail(float[] averge) {
		for(int i=0;i<averge.length;i++) {
			if(averge[i]<60) {
				System.out.println("學號"+(i+1)+"號同學總平均分數為"+averge[i]+"未達及格標準。");
			}
		}
	}
	public static void show(int number,int com,int math,int eng,float averge)throws IOException {
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int line;
		char c;
		System.out.print("請輸入一個正整數：");
		line=Integer.parseInt(buf.readLine());
		System.out.print("請輸入一個符號：");
		String str=buf.readLine();
		c=str.charAt(0);
		System.out.println("\t學號\t計概\t數學\t英文\t平均");
		line(line,c);
		System.out.println("\t"+number+"\t"+com+"\t"+math+"\t"+eng+"\t"+averge);
		
	}
	public static void minmax(float subject[]) {
		float max=subject[0];
		float min=subject[0];
		for(int i=1;i<subject.length;i++) {
			if(subject[i]>max) {
				max=subject[i];
			}
			if(subject[i]<min) {
				min=subject[i];
			}
		}
		System.out.println("最高分為："+max+"分，最低分為："+min+"分。");
	}
	public static void line(int len,char type) {
		for(int i = 0;i<len;i++) {
			System.out.print(type);
		}
		System.out.println();
	}
	public static void show_all(int number,int c_score[],int m_score[],int e_score[],float a_score[])throws IOException {
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int line;
		char c;
		System.out.print("請輸入一個正整數：");
		line=Integer.parseInt(buf.readLine());
		System.out.print("請輸入一個符號：");
		String str=buf.readLine();
		c=str.charAt(0);
		System.out.println("\t學號\t計概\t數學\t英文\t平均");
		line(line,c);
		
		for(int j=1;j<=number;j++) {
			System.out.println("\t"+j+"\t"+c_score[j-1]+"\t"+m_score[j-1]+"\t"+e_score[j-1]+"\t"+a_score[j-1]);
		}
		
	}
	
}
