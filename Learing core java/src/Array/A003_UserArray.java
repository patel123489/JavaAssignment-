package Array;

import java.util.Scanner;

public class A003_UserArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of a Array:");
		int size = sc.nextInt();

		int a[] = new int[size];

		for (int i = 0; i < a.length; i++) {

			System.out.println("Enter Value For Index:" + i);
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}
	}
}