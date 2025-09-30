package patterns;

public class P15 {

	public static void main(String[] args) {
//		A 
//		B C 
//		D E F 
//		G H I J 
		
		int num = 4;
		char count = 'A';
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}
}