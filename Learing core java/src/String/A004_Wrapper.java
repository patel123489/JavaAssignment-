package String;

public class A004_Wrapper {

	public static void main(String[] args) {

		int i = 10;

		Integer i1 = new Integer(i);

		Integer i2 = i;

		Integer a = 15;

		int a1 = a.intValue();

		int a2 = a;

		System.out.println(i);
		System.out.println(a);

		int k = 123456;
		Integer k1 = k;

		int j = k1.toString().length();
		System.out.println(j);

	}
}