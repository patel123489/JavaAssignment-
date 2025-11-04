package FileIO;

import java.io.Serializable;

public class Student implements Serializable{
		
		int id = 18;
		String name = "Om";
		transient String email = "Om@gmail.com";
		
		public void display()
		{
			System.out.println(id+" "+name+" "+email);
		}
	}