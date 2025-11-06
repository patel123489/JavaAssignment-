package Threads;

class Calc {
	synchronized public void table(int number) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + number * i);
		}
	}
}

class Test extends Thread {
	Calc c;

	Test(Calc c) {
		this.c = c;
	}

	public void run() {
		c.table(16);
	}
}

public class T005_MethodSync {
	public static void main(String[] args) {

		Calc c1 = new Calc();

		Test t1 = new Test(c1);
		Test t2 = new Test(c1);
		Test t3 = new Test(c1);

		t1.start();
		t2.start();
		t3.start();
	}
}