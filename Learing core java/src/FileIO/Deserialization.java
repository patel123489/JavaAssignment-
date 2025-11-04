package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	 public static void main(String[] args) {
		
		 FileInputStream fis = null;
		 ObjectInputStream os = null;
		 
		 try {
			fis = new FileInputStream("D:\\Files\\Demo.ser");
			os = new ObjectInputStream(fis);
			
			Student st = (Student) os.readObject();
			st.display();
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}