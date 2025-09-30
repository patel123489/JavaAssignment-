package OOPS;

class method {
	public void display() {
		System.out.println("Running Display....");
	}

	public void add(int a, int b) {
		System.out.println("Addition is :" + (a + b));
	}

	public String message() {
		return "Hello Om Patel";
	}

	public int square(int i) {
		return i * i;
	}

	public void addArray(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("Sum is :" + sum);
	}

	public int[] revArray(int a[]) {
		int b[] = new int[a.length];
		for (int i = a.length - 1; i >= 0; i--) {
			b[(a.length - 1) - i] = a[i];
		}
		return b;
	}

	public void random(int... a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}

public class A005_MethodManipulation {
	public static void main(String[] args) {

		method m1 = new method();
		m1.display();
		m1.add(45, 18);

		String s = m1.message();
		System.out.println(s);
		System.out.println(m1.message());

		System.out.println("Square is :" + m1.square(18));

		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 1, 2, 3, 4, 5};
		m1.addArray(a);

		System.out.println("************************************");

		int k[] = m1.revArray(b);
		for (int i = 0; i < k.length; i++) {
			System.out.println(k[i]);
		}

		m1.random(10, 20, 30, 40, 50, 60);
	}
}