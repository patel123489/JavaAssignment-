package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class P1_Deserialization {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		ObjectInputStream os = null;
		
		try {
			fis = new FileInputStream("D:\\Files\\Demo1.ser");
			os = new ObjectInputStream(fis);
			
			Product  P = (Product) os.readObject();
			P.display();
			} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}