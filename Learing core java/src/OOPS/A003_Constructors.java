package OOPS;

class Student1 {
	int id;
	String Name;

	Student1(int id, String Name) {
		this.id = id;
		this.Name = Name;
	}

	public void display() {
		System.out.println(id + " " + Name);
	}
}

public class A003_Constructors {
	public static void main(String[] args) {

		Student1 s1 = new Student1(1, "OM");
		s1.display();

		Student1 s2 = new Student1(2, "Patel");
		s2.display();
	}
}