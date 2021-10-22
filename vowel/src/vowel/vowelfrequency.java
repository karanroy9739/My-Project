package vowel;

import java.util.Scanner;

public class vowelfrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s = new Scanner(System.in);
    System.out.println("enter the string :");
    String Str = s.nextLine();
   int a=0,e=0,i=0,o=0,u=0;
    	Str = Str.toLowerCase();
    	for(int j =0;j<Str.length();++j) {
    		char ch = Str.charAt(j);
    		if(ch=='a') { ++a;}
    		else if(ch=='e') {++e;}
    		else if(ch=='i') {++i;}
    		else if(ch=='o') {++o;}
    		else if(ch=='u') {++u;}
    	}
    	System.out.println(".vowelfrequency");
    	System.out.println("a..>"+a);
    	System.out.println("e..>"+e);
    	System.out.println("i..>"+i);
    	System.out.println("o..>"+o);
    	System.out.println("u..>"+u);
	}

}
