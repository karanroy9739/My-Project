package vectors;

import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vector <Integer> v=new Vector();
	       v.add(10);
	       v.add(52);
	       v.add(1,30);
	       v.add(345);
	       v.add(2,34);
	       for(int i=0;i<v.size();i++) {
	    	   System.out.println(v.get(i));
	       }


	}

}
