package count;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "karan neha";
		int count;
		 char string[]= s1.toCharArray();
		 System.out.println("duplicate charater in string");
		 for(int i=0;i<s1.length();i++){
			 count = 1;
			 for(int j=i+1;j<s1.length();j++) {
				 if(string[i]==string[j]&&string[i]!=0) {
					 count++;
					 string[j]=0;
				 }
			 }
			 if(count>1&&string[i]!=0) {
				 System.out.println(string[i]);
			 }
			 
		 }
	}

}
