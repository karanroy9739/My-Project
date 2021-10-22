package palinrome;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 745, reversed = 0;
		int t =num;
		int sum = 0;
		while(num>0) {
			int r= num%10;
			sum =sum*10+r;
			num =num/10;
		}
		{
		System.out.println("Reverse number "+ sum);
	  }
	if(sum==t) {
		System.out.println("number is palindrome");
	}
	else {
		System.out.println("number is not palindrome");
	}
	
	
	}
}
