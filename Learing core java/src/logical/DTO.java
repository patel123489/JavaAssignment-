package logical;

public class DTO {

	public static void main(String[] args) {
		
		long num = 1234;
		long sum = 0;
		long count = 1;
		while(num!=0)
		{
			
			long rem = num%8;
			sum = (rem*count) + sum;
			num = num/8;
			count *=10;
		}
			System.out.println(sum);

	}

}
