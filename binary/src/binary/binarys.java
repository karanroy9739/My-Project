package binary;

import java.util.Arrays;
import java.util.Scanner;

public class binarys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the elments you want in a array");
Scanner n = new Scanner(System.in);
int a= n.nextInt();
int arr[]=new int[a];
System.out.println("enter" + a +" elemnts");
for(int i=0; i<arr.length; i++) {
	arr[i]=n.nextInt();
	
}
Arrays.sort(arr);
System.out.println("enter the number u want to search");
int Item= n.nextInt();
int beg=0,end=arr.length-1,mid=(beg+end)/2;
while(beg<=end) {
	if(Item==arr[mid]){
		System.out.println("item found");
		break;
	
	}
	else if(Item>arr[mid]) {
		beg=mid+1;
		
	}
	else {
		end=mid-1;
		
	}
	mid =(beg+end)/2;
	
}
if(beg>end) {
	System.out.println("item not found");
}
}

}
