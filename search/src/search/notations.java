package search;

public class notations {

	public static void main(String[]args) {
		// TODO Auto-generated constructor stub
		int arr[] = {11,57,37,29,23,45};
		int t;
		t=arr[0];
		for(int i = 1; i<arr.length; i++) {
			arr[i - 1]= arr[i];
		
		}
		arr[arr.length-1] = t;
		for (int i = 0; i<arr.length; i++) {
				System.out.println(arr[i]);
		
			}
	}


}
