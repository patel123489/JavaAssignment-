package FileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class P1_Serialization {
        public static void main(String[] args) {
			
        	Product P = new Product();
        	
        	FileOutputStream fos = null;
        	ObjectOutputStream os = null;
        	
        	try {
				fos = new FileOutputStream("D:\\Files\\Demo1.ser");
				os = new ObjectOutputStream(fos);
				
				os.writeObject(P);
				
				System.out.println("Completed");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}