import java.io.*;
public class HW3_5 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int withdrawal,deposit,action,balance=0;
		boolean mode = true;
		while(mode){
			System.out.print("�п�ܥ\��]1.���ڡB2.�s�ڡB3.�d�߾l�B�B4.���}�^�G");
			action = Integer.parseInt(buf.readLine());
			if(action>4 || action<1) {
				System.out.println("��J���~�A�S�����\��A�Э��s��J�C");
				continue;
			}
			switch(action) {
			case 1 :
				System.out.print("�п�J���ڪ��B�G");
				withdrawal = Integer.parseInt(buf.readLine());
				if(withdrawal>balance) System.out.println("���B�����A�ثe�l�B�G"+balance);
				else {
					balance-=withdrawal;
					System.out.println("���ڦ��\�A�ثe�l�B�G"+balance);
				}
				continue;
			case 2 :
				System.out.print("�п�J�s�ڪ��B�G");
				deposit= Integer.parseInt(buf.readLine());
				balance+=deposit;
				System.out.println("�s�ڦ��\�A�ثe�l�B�G"+balance);
				continue;
			case 3 :
				System.out.println("�ثe�l�B�G"+balance);
				continue;
			case 4 :
				System.out.println("�P�±z���ϥΡA�w��U�������{�C");
				mode =false;
	
			}
		}
	}
}
 