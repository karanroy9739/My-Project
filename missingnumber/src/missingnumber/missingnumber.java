package missingnumber;

public class missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,10,5,9,2,7,3,0,4,6};
        int n=arr.length;
        int sum=n*(n+1)/2;
        int emptyspace=0;
        int missingnum=0;
        int result=0;
        
        for(int i=0;i<n;i++) {
        	if(arr[i]==0) {
        		emptyspace=i;
        	}
        	else {
        		result=result+arr[i];
        	}
        }
        missingnum=sum-result;
        System.out.println("missing number is:"+ missingnum);
		
		
		
	}

}
