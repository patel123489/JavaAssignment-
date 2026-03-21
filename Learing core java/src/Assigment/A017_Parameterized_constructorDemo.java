package assignment;

class student{
	
	int id;
	String name;
	int age;
	String email;
	public student(int id, String name, int age, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
     public void show() {
		
    	 System.out.println("id :"+id);
    	 System.out.println("name :"+name);
    	 System.out.println("age :"+age);
    	 System.out.println("email :"+email);
	}
}

public class A017_Parameterized_constructorDemo {
	public static void main(String[] args) {
		
		student s=new student(10, "Om", 22, "PatelOm@gmail.com");
		student s1=new student(15, "Harshit", 21, "PatelHarshit@gmail.com");
		
		s.show();
		s1.show();
	}

}
