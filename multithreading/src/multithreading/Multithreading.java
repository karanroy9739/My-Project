package multithreading;

public class Multithreading extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Multithreading t1 = new Multithreading();
       Multithreading t2 = new Multithreading();
       t1.start();
       t2.start();
	}
	public void run() {
		for(int i =0;i<5;i++) {
			System.out.println(i);
			try {
              Thread.sleep(10000);				
			}
			catch(Exception ignored) {
				
			}
			
		}
	}

}
