package prime;

import java.util.Scanner;

public class prime {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
      Scanner n = new Scanner(System.in);
      int s = n.nextInt();
     int Flag = 0;
     for(int i =2; i<=s/2; i++) {
    	 if(s%2==0) {
    		 Flag=2;
    		 System.out.println("not prime");
    		 break;
    		 
    	 }
    	 if(Flag==0) {
    		 System.out.println("its prime");
    		 break;
    	 }
     }
    
	}

}
