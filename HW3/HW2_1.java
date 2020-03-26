
public class HW2_1 {
	public static void main (String[] args) {
		int i=1;
		int a = i++;
		int b = ++i;
		double c = 100/31*31+15-2-23*96/3+17*2/8+100;
		i--;
		System.out.print("i="+i+"\na="+a+"\nb="+b+"\nc="+c);
		
		//不同。a運算式為先將i數值放進a中（此時i值為1），再進行i++的運算（當中改變數值的變數只有i，故此時的a=1，i=2）；b運算式則為先做i+1的運算（此時b與i值皆為3），再將i的值放進b中。最後的運算i--，則使i=2。
		
		//不一樣。使用計算機計算出來的結果為-418.75，考慮上先乘除後加減得到的輸出應為-518.75，運算式中的數字皆以整數型態表示，故程式自動辨別為整數型態，只有變數c被設為double，故產生誤差。
		//若要以正確的double型態輸出應將運算式中的整數皆改為小數型態。即100.0/31.0*31.0+15.0-2.0-23.0*96.0/3.0+17.0*2.0/8.0+100.0。
		
	}

}
