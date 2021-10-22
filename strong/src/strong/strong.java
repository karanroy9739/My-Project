package strong;

import java.util.Scanner;

public class strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("ener the number");
         Scanner n = new Scanner(System.in);
         int num = n.nextInt();
         int f =0;
         int sum =0;
         int t = num;
         while(num>0) {
        	 int r = num%10;
        	 f= fact(r);
        	 sum= sum+f ;
        	 num = num/10;
        	 
         }
         if(t==sum) {
        	 System.out.println("number is strong");
         }
         else {
        	 System.out.println("number is not strong"); 
         }
	}
	public static int fact(int num) {
		int f = 1;
		for (int i = 1; i<=num; i++) {
			f=f*i;
		}
		return f;
		
		
	}

}