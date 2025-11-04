package String;

class A {
	int id = 18;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello" + id;
	}
}

public class A006_ObjectDemo {

	public static void main(String[] args) {

		A a = new A();
		System.out.println(a.getClass());

		System.out.println(a);
	}
}