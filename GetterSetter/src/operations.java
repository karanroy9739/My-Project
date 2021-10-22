import java.util.Scanner;
import java.util.Vector;

public class operations {
	static void input(Vector<Students> v) {
		int r,m1,m2,m3;
		String n ;
		Scanner s = new Scanner(System.in);
		for(int i =0;i<3;i++) {
			System.out.println("enter the roll number:");
			r=s.nextInt();
			System.out.println("enter the name:");
			n=s.next();
			System.out.println("enter the marks 1:");
			m1=s.nextInt();
			System.out.println("enter the marks 2:");
			m2=s.nextInt();
			System.out.println("enter the marks 3:");
			m3=s.nextInt();
			Students obj = new Students();
			obj.setroll(r);
			obj.setname(n);
			obj.setmarks1(m1);
			obj.setmarks2(m2);
			obj.setmarks3(m3);
			v.add(obj);
		}
	}
	
	static void output(Vector<Students> v) {
		 for(int i=0; i<v.size();i++) {
			 Students obj = v.get(i);
			 double avg = (double)((obj.getmarks1()+obj.getmarks2()+obj.getmarks3())/3);
			 double percentage = (double)((obj.getmarks1()+obj.getmarks2()+obj.getmarks3()/3)*100);
			 System.out.println(obj.getroll()+"\t"+obj.getname()+"\t"+"marks : " +obj.getmarks1()+"\t"+obj.getmarks2()+"\t"+obj.getmarks3()+" Average : "+avg+" Percentage : "+percentage);
		 }
	}

}
