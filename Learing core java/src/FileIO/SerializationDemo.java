package FileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
		
    	Student st = new Student();
    	
    	FileOutputStream fos = null;
    	ObjectOutputStream os = null;
    	
    	try {
			fos = new FileOutputStream("D:\\Files\\Demo.ser");
			os = new ObjectOutputStream(fos);
			
			os.writeObject(st);
			
			System.out.println("Done");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}