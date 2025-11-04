package ExceptionHandling;

class Calc {
	public void Square(int i) {
		System.out.println(i * i);
		i++;
		if (i < 20) {
			Square(i);
		}
	}
}

public class Recursion {
	public static void main(String[] args) {

		Calc C1 = new Calc();
		C1.Square(21);
	}
}