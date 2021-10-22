package vowelreplace;

import java.util.Scanner;

public class vowelreplace {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String s1= "";
        int flag = 0;
        for(int i =0;i<str.length();i++) {
        	char ch=str.charAt(i);
        	if(ch=='o') {
        		flag=1;
        		int m =i*5;
        		int sum=0;
        		for(int j=1;j<m;j++) {
        			if(j%2!=0) {
        				sum= sum+j;
        				
        			}
        				
        		}
        		int sm=0;
        		while(sum>0) {
        			int r=sum%10;
        			sm=sm+r;
        			sum=sum/10;
        		}
        		s1 = s1+sm;
        		continue;
        		
        	}
        	if(ch=='a') {
        		int m=i*5;
        		int sum=0;
        		for(int j=1;j<m;j++) {
        			if(j%2!=0) {
        				sum=sum+j;
        }
        		}
        		int sm=0;
        		int k=0;
        		System.out.println(sum);
        		while(sum>0) {
        			if(k==1) {
        				break;
        			}
        			int r=sum%10;
        			sm=sm+(int)r;
        			sum=sum/10;
        		}
        		sm=sm-9;
        		System.out.println(sm);
        		s1=s1+sm;
        		continue;
        		}
        	s1=s1+ch;
        	
        }
        if(flag==0) {
        	System.out.println(-1);
        }
        else {
        	System.out.println(s1);
        }
        }

}
