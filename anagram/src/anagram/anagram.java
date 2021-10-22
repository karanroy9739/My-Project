package anagram;

import java.util.Arrays;

public class anagram {
	static void anagram1(String Str1, String Str2) {
		String S1 =Str1.replaceAll(" ","");
		String S2=Str2.replaceAll(" ","");
		boolean status= true;
		if(S1.length()!=S2.length()) {
			status =false;
		}else {
			char[]ArrayS1=S1.toLowerCase().toCharArray();
			char[]ArrayS2=S2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
             status=Arrays.equals(ArrayS1,ArrayS2);			
		}
		if(status) {
			System.out.println( S1 +"  and "  + S2 +" are anagram");
		}else {
			System.out.println("not anagram");
		}
	}
		 public static void main(String[] args) {
		// TODO Auto-generated method stub
		anagram1("listen","ntesil");
		anagram1("rirtish","raghav");
			
		}

	

}
