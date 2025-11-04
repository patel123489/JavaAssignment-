package FileIO;

import java.io.Serializable;

public class Product implements Serializable {

	int pid = 1809;
	int size = 45;
	String name = "T-shirt";
	
	public void display()
	{
		System.out.println(pid+" "+size+" "+name);
	}
}