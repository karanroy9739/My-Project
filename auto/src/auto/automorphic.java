package auto;

import java.util.Scanner;

public class automorphic {
	static boolean isautomorphic(int num) {
		 int square= num*num;
		 while(num>0) {
			 if(num%10!=square%10) 
				 return false;
				 num = num/10;
				 square=square/10;
			}
		 return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner n = new Scanner(System.in);
      System.out.println("enter the number");
      int num =n.nextInt();
      
	if(isautomorphic(num)) {
		
		System.out.println("autmorphic");
	}
	else {
		System.out.println(" not autmorphic");
	}

	
	
}
}