import java.io.*;
public class HW5_1 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int i,F = 0,max,min,P = 0;
		float averge = 0;
		System.out.print("�п�J�ǥͤH�ơG");
		i=Integer.parseInt(buf.readLine());
		int score[] = new int[i];
		System.out.println("----------------------------");
		System.out.println("�}�l��J�ǥͦ��Z");
		for(int s=1;s<=score.length;s++) {
			System.out.print("�п�J��"+s+"��ǥͦ��Z�G");
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
		System.out.println("���Z�έp���G�p�U�G"+"\n�@��"+i+"����ơG"+F+"�H���ή�A"+P+"�H�ή�A�̰�����"+max+"�A�̧C����"+min+"�A�������Ƭ�"+averge);
	}
}
