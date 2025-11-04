package FileIO;

import java.io.FileReader;
import java.io.IOException;

public class F003_FileReader {
	public static void main(String[] args) {

		FileReader fr = null;

		try {
			fr = new FileReader("D:\\Files\\Home.txt");
			int i = fr.read();

			while (i != -1) {
				char ch = (char) i;
				System.out.print(ch);
				i = fr.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}