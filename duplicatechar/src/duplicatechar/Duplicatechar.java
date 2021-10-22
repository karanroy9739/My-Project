package duplicatechar;

import java.util.Scanner;

public class Duplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s = new Scanner(System.in);
       System.out.println("enter a string");
       String str =s.nextLine();
       char[] chararray = str.toCharArray();
       System.out.println("duplicate charater in the string");
       for(int i =0; i<str.length(); i++) 
    	   for(int j=i+1; j<str.length();j++) {
    		   if (chararray[i]==chararray[j]) {
    			   System.out.println(chararray[i]+ "");
    			   break;
    		   }
    	   }
       }
	}


