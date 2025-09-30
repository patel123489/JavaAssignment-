package Array;

public class A004_ArrayCopy {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int b[] = new int[a.length];

		System.arraycopy(a, 2, b, 5, 3);

		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}