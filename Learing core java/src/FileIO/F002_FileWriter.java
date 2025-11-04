package FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class F002_FileWriter {
	public static void main(String[] args) {

		FileWriter fw = null;

		try {
			fw = new FileWriter("D:\\Files\\Home.txt");

			String str = "Hello Java, Hello Tops";
			fw.write(str);
			fw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}