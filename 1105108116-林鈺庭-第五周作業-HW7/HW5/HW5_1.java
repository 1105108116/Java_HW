import java.io.*;
public class HW5_1 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int i,F = 0,max,min,P = 0;
		float averge = 0;
		System.out.print("請輸入學生人數：");
		i=Integer.parseInt(buf.readLine());
		int score[] = new int[i];
		System.out.println("----------------------------");
		System.out.println("開始輸入學生成績");
		for(int s=1;s<=score.length;s++) {
			System.out.print("請輸入第"+s+"位學生成績：");
			score[s-1]=Integer.parseInt(buf.readLine());
		}
		
		max = min = score[0];
		for(int c=0;c<score.length;c++) {
			averge +=score[c];
		
			if(score[c]>max) {
				max = score[c];
			}
			if(score[c]<min) {
				min = score[c];
			}
			if(score[c]>=60) {
				P++;
			}
			if(score[c]<60) {
				F++;
			}
		}
		averge = averge/i;
		System.out.println("----------------------------");
		System.out.println("成績統計結果如下："+"\n共有"+i+"筆資料："+F+"人不及格，"+P+"人及格，最高分為"+max+"，最低分為"+min+"，平均分數為"+averge);
	}
}
