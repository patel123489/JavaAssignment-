package patterns;

public class P13 {

	public static void main(String[] args) {
//		0
//		10
//		010
//		1010
//		01010
		
		int starCount  =1;
		for(int j=1;j<=5;j++)
		{
			for(int i=1;i<=starCount;i++)
			{
				System.out.print((i+j)%2);
			}
			System.out.println();
			starCount++;
		}

	}

}