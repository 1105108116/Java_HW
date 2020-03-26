import java.io.*;
import java.lang.Math;
public class HW5_2 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int i;
		float P1,P2,P3,P4,P5,P6;
		P1=P2=P3=P4=P5=P6=0;
		System.out.print("請輸入你要投擲的次數：");
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
		System.out.println("點數1出現的機率為："+P1/i+"\n點數2出現的機率為："+P2/i+"\n點數3出現的機率為："+P3/i+"\n點數4出現的機率為："+P4/i+"\n點數5出現的機率為："+P5/i+"\n點數6出現的機率為："+P6/i);
	}
}
