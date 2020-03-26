import java.io.*;
public class HW3_3 {
	public static void main (String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int i;
		System.out.print("½Ð¿é¤J¼Æ¦r½d³ò¡G");
		i=Integer.parseInt(buf.readLine());
		int prime[] = new int[i/2];
		prime[0]=2;
		int index =1;
		for(int a=1;a<=i;a++) {
			for(int b=2;b<a;b++) {
				if(a%b==0) {
					break;
				}
				if(b == a-1) {
					prime[index] = a;
					index++;				
				}
			}
	
		}	
		
		
		for(int p=1;p<prime.length;p++) {
			if(prime[p]!=0){
				if(prime[p]-prime[p-1]==2) {
					System.out.println("("+prime[p-1]+","+prime[p]+")");
				}
			}
		}
		
	}

}
