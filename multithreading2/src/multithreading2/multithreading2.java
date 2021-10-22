package multithreading2;

public class multithreading2 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       multithreading2 t1 = new multithreading2();
       multithreading2 t2= new multithreading2();
       Thread d1 =new Thread(t1);
       Thread d2 =new Thread(t2);
       d1.start();
       d2.start();
	}
	public void run(){
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception ignored) {
		}
	}
	}
}

