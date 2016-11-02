package AkieThr;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		//System.out.println("This is Thread2");
		System.out.println(Thread.currentThread().getName());
	}
	 

}
