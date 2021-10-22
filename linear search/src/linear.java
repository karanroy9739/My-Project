import java.util.Arrays;
import java.util.Scanner;

public class linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		int f = 0;
		int arr[] = {34,4,6,85,7,32};
		System.out.println(" number enter karo");
		int item = n.nextInt();
		Arrays.sort(arr);
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i<arr.length; i++) {
		if(item == arr[i]) {
			f = 2;
			System.out.println("element found at index "+i);
			break;
		}
	}
	if(f==0) {
		System.out.println("not found");
	}
	
	}
        

}
