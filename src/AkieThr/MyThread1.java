package AkieThr;

public class MyThread1 implements Runnable {

	@Override
	public void run() {
		//System.out.println("This is my Thread1 class");
		System.out.println(Thread.currentThread().getName());
		MyThread2 t22 = new MyThread2();
		
		Thread d = new Thread(t22);
		d.start();
		try {
			d.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		/*for (int i = 0; i < 10; i++) {
			System.out.println("This is Thread1");
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
		//} 
			
		
	}

}
