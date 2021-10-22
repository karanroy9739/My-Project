package keprekar;

import java.util.Scanner;

public class keprekar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n  = new Scanner(System.in);
		System.out.println("enter the number");
          long num = n.nextInt();
          long count = 0;
          long sum= 0;
          long t= 0;
          long square =num*num;
          System.out.println(square);
          t = square;
        while(t>0) {
        	count++;
        	t = t/10;
        	
        }
        System.out.println(count);
          
	}
	
	
	
	

}
