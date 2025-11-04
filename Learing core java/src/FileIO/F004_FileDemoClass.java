package FileIO;

import java.io.File;
import java.io.IOException;

public class F004_FileDemoClass {
	public static void main(String[] args) {

		File f = new File("D:\\Files\\Test");

//		System.out.println(f.exists());

//		try {
//			f.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		f.delete();

//		System.out.println(f.isFile());
//		System.out.println(f.isDirectory());
		f.mkdir();
	}
}