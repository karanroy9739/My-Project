package remove;

import java.util.Scanner;

public class removeletter {
	static void removechar(String s, char c) {
		int j,count =0, n=s.length();
		char[]t=s.toCharArray();
		for(int  i = j=0; i<n; i++) {
			if(t[i]!=c)
				t[j++]=t[i];
			else
				count++;
		}
		while (count>0) {
			t[j++]='\0';
			count--;
		}
		System.out.println(t);
			
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the statement:");
		String Str= s.nextLine();
		System.out.println("enter the letter you want remove:");
		String Str1 = s.nextLine();
		System.out.println("after removing:");
        char S = Str1.charAt(0);
		removechar(Str,S);
		
		
	}

}
