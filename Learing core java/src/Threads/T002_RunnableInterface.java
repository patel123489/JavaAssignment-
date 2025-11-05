package Threads;

class Sample {

}

class Th1 extends Sample implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " :" + i);
		}
	}
}

public class T002_RunnableInterface {
	public static void main(String[] args) {

		Th1 t1 = new Th1();
		Th1 t2 = new Th1();

		Thread Th1 = new Thread(t1);
		Thread Th2 = new Thread(t2);

		Th1.setName("A");
		Th2.setName("B");

		Th1.start();
		Th2.start();
	}
}