package String;

public class A003_StringBufferBulider {

	public static void main(String[] args) {

		double startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Hello");
		for (int i = 0; i < args.length; i++) {
			sb.append("Java");

		}

		double endTime = System.currentTimeMillis();

		double startTime1 = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("Hello");
		for (int i = 0; i < args.length; i++) {
			sb1.append("Java");
		}
		double endTime1 = System.currentTimeMillis();

		System.out.println("Time Taken by buffer:" + (endTime - startTime));
		System.out.println("Time Taken by builder:" + (endTime1 - startTime1));
	}
}