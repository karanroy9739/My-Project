package number;

import java.util.Scanner;

public class armstrome{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("enter a number");
      Scanner n = new Scanner(System.in);
      int num = n.nextInt();			
      int sum = 0;
      int t =num;
      while(num>0) {
    	  int r=num%10;
    	  num=num/10;
    	  sum=sum+ (int) Math.pow(r, 3);
    		  
    	}
      if(sum==t) {
    	  System.out.println("armstrome");
      }
      else {
    	  System.out.println(" not armstrome");
      }
	}

}
