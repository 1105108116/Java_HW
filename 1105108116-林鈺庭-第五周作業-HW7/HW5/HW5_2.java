import java.io.*;
import java.lang.Math;
public class HW5_2 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int i;
		float P1,P2,P3,P4,P5,P6;
		P1=P2=P3=P4=P5=P6=0;
		System.out.print("�п�J�A�n���Y�����ơG");
		i=Integer.parseInt(buf.readLine());
		int record[] = new int[i];
		for(int t=0;t<record.length;t++) {
			record[t] = (int) (Math.random()*6+1);
			if(record[t]==1) {
				P1++;
			}
			if(record[t]==2) {
				P2++;
			}
			if(record[t]==3) {
				P3++;
			}
			if(record[t]==4) {
				P4++;
			}
			if(record[t]==5) {
				P5++;
			}
			if(record[t]==6) {
				P6++;
			}
		}
		System.out.println("�I��1�X�{�����v���G"+P1/i+"\n�I��2�X�{�����v���G"+P2/i+"\n�I��3�X�{�����v���G"+P3/i+"\n�I��4�X�{�����v���G"+P4/i+"\n�I��5�X�{�����v���G"+P5/i+"\n�I��6�X�{�����v���G"+P6/i);
	}
}
