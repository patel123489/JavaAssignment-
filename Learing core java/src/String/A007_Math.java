package String;

import java.util.Date;
import java.util.Random;

public class A007_Math {
	public static void main(String[] args) {

		System.out.println(Math.PI);
		System.out.println(Math.sqrt(25));
		System.out.println(Math.floor(5.6));
		System.out.println(Math.ceil(5.6));
		System.out.println(Math.round(5.7));
		System.out.println(Math.pow(5, 2));
		System.out.println(Math.tan(0));

		System.out.println("***********************************************");

		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getDate());
		System.out.println(date.getYear());
		System.out.println(date.getHours());
		System.out.println(date.getDay());
		System.out.println(date.getMinutes());
		System.out.println(date.getMonth());
		System.out.println(date.getSeconds());
		System.out.println(date.getTimezoneOffset());
		System.out.println(date.getTime());

		System.out.println("***********************************************");

		Random r = new Random();
		int num = r.nextInt(100, 999);
		System.out.println(num);

		System.out.println("************************************************");

		Date D1 = new Date(1);
		System.out.println(D1);
	}
}