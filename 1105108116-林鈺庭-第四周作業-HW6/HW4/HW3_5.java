import java.io.*;
public class HW3_5 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int withdrawal,deposit,action,balance=0;
		boolean mode = true;
		while(mode){
			System.out.print("請選擇功能（1.提款、2.存款、3.查詢餘額、4.離開）：");
			action = Integer.parseInt(buf.readLine());
			if(action>4 || action<1) {
				System.out.println("輸入錯誤，沒有此功能，請重新輸入。");
				continue;
			}
			switch(action) {
			case 1 :
				System.out.print("請輸入提款金額：");
				withdrawal = Integer.parseInt(buf.readLine());
				if(withdrawal>balance) System.out.println("金額不足，目前餘額："+balance);
				else {
					balance-=withdrawal;
					System.out.println("提款成功，目前餘額："+balance);
				}
				continue;
			case 2 :
				System.out.print("請輸入存款金額：");
				deposit= Integer.parseInt(buf.readLine());
				balance+=deposit;
				System.out.println("存款成功，目前餘額："+balance);
				continue;
			case 3 :
				System.out.println("目前餘額："+balance);
				continue;
			case 4 :
				System.out.println("感謝您的使用，歡迎下次的光臨。");
				mode =false;
	
			}
		}
	}
}
 