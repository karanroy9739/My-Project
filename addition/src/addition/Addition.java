package addition;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter first number :");
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		System.out.println("enter second number :");
		Scanner s = new Scanner(System.in);
		int s2 = sc.nextInt();
		int sum = s1+s2;
		System.out.println(sum);
	
	}

}
