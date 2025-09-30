package patterns;

public class P14 {

	public static void main(String[] args) {
//		1
//		00
//		111
//		0000
//		11111
		
		int starCount  =1;
		for(int j=1;j<=5;j++)
		{
			for(int i=1;i<=starCount;i++)
			{
				System.out.print((j)%2);
			}
			System.out.println();
			starCount++;
		}

	}

}