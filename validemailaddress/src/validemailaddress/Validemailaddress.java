package validemailaddress;

import java.util.Scanner;

public class Validemailaddress {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the email :");
     Scanner s = new Scanner(System.in);
     String s1 = s.nextLine();
     String s1range=s1.substring(0,50);
     System.out.println(s1range);
     int count =0;
     try {
    	 for(int i=0;i<s1.length();i++) {
    		if(s1.charAt(i)== '_') {
    			count++;
    			break;
    		}
    	 }
    	 for(int i=0;i<s1.length();i++) {
    		 if(s1.charAt(i)=='.') {
    			 count++;
    			 break;
    		 }
    	 }
    	 for(int i=0;i<s1.length();i++) {
    		 if(s1.charAt(i)=='@') {
    			 count++;
    			 break;
    		 }
    	 }
    		
    	 if(count<3) {
    		 throw new Exception("invalid");
    	 }
    	 
     System.out.println("valid");
    	 
     }
     catch(Exception e) {
    	 System.out.println(e.getMessage());
     }
	}

}
