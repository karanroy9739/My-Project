package position;

public class lastpositions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str = "hello how are you,hello i am good";
       int lastindex = str.lastIndexOf("hello");
       if(lastindex==-1) {
    	   System.out.println("hello not found");
       }
       else {
    	   System.out.println("last ocurrence of hello at " + lastindex);
       }
	}

}
