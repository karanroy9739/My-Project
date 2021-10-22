package palindromestring;

import java.util.Scanner;

public class palandromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
      System.out.println("enter the string:");
      String s1 = s.nextLine();
      checkpalindrome(s1);
      
	}
	static void checkpalindrome(String input) {
		boolean result = true;
		int length = input.length();
		for(int i =0;i<length/2;i++) {
			if (input.charAt(i)!=input.charAt(length-i-1)) {
				result= false;
				System.out.println(input + " is not palidrome ");
				break;
			}
			else {
				System.out.println(input + " is  palidrome  ");
				break;
			}
		}
	}

}
