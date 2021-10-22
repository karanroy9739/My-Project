package vowelcount;

import java.util.Scanner;

public class Vowelcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		    System.out.println("enter the string :");
		    String Str = s.nextLine();
		    System.out.println(fun(Str));

	}
	
	public static int fun(String Str) {
		int count = 0;
		for(int i=0; i<Str.length();i++) {
			char ch=Str.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		return count;
		
	}

}
