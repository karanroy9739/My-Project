package swapstring;

import java.util.Scanner;

public class swapstring {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first string: ");
		String Str1 =s.nextLine();
		System.out.println("enter the second string: ");
		String Str2 =s.nextLine();
		System.out.println("before swapping : " + Str1 + " " + Str2 );
        Str1= Str1 + Str2;
        Str2 = Str1.substring(0,Str1.length()-Str2.length());
        Str1= Str1.substring(Str2.length());
        System.out.println("after swapping : " + Str1 + " " + Str2 ); 
	}



}
