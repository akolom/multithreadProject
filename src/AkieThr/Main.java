package AkieThr;

public class Main {

	public static void main(String[] args) {
		MyThread1 t1= new MyThread1();
			/*	MyThread2 t2= new MyThread2();
		Thread r2= new Thread(t2);*/
		Thread r= new Thread(t1);
		/*r.setPriority(1);
		r2.setPriority(10);*/
		/*r2.setDaemon(true);*/
		
		// the main method executes after r2
//		/*try {
//			r2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
		
//			e.printStackTrace();
//		}*/
		r.start();
		//r2.start();
		
		
		//System.out.println("This is main");
		System.out.println(Thread.currentThread().getName());
		
		

	}
	
	public static int m1(){
		return 1;
	}
	
	public void m2(){
		System.out.println(m1());
	}

}
