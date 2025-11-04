package FileIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class F001_FileOutputStream {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = sc.nextLine();

		System.out.print("Enter your email: ");
		String email = sc.nextLine();

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("D:\\Files\\" + name + ".txt");

			byte b[] = email.getBytes();
			fos.write(b);

			System.out.println("Data written successfully to file!");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}