package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class Demo {
	public void test() throws FileNotFoundException {

		FileOutputStream fos = new FileOutputStream("D://Test.txt");

	}
}

public class E002_CompileTime {
	public static void main(String[] args) {

		Demo D1 = new Demo();
		try {
			D1.test();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}