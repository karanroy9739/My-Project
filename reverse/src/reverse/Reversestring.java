package reverse;

public class Reversestring{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "neha";
        char ch[]=str.toCharArray();  
        String rev="";  
        for(int i=ch.length-1;i>=0;i--){  
            rev+=ch[i];  
            
        }  
        System.out.println(rev);
        }

}
