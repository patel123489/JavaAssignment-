package patterns;

public class P2 {

	public static void main(String[] args) {
	
//		*
//		**
//		***
//		****
//		*****
				
		int starCount  =1;
		for(int j=1;j<=5;j++)
		{
			for(int i=1;i<=starCount;i++)
			{
				System.out.print("*");
			}
			System.out.println();
			starCount++;
		}
		
	}
}