import java.io.*;
import java.lang.Math;
public class HW5_3 {
	public static void main (String[] args) throws IOException
	{
		int i,m_max,e_max,c_max,F=0,P=0;
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�п�J�ǥͤH�ơG");
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
			averge[a] = (math[a]+eng[a]+com[a])/3;
			if(averge[a]>=60) {
				P++;
			}else F++;
		}
		System.out.println("\t�Ǹ�\t�p��\t�ƾ�\t�^��\t����");
		System.out.println("-----------------------------------------------");
		for(int j=1;j<=i;j++) {
			
			System.out.println("\t"+j+"\t"+com[j-1]+"\t"+math[j-1]+"\t"+eng[j-1]+"\t"+averge[j-1]);
		}
		System.out.println("�p���̰�����"+c_max+"�A�ƾǳ̰�����"+m_max+"�A�^��̰�����"+e_max+"\n�`�������ή榳"+F+"���A�`�����ή榳"+P+"��");
	}
}
