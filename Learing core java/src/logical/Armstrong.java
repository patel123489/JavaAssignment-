package logical;

public class Armstrong {
		public static void main(String[] args) {
			//153 : 1+125+27=153
			int num = 153;
			int temp = num;
			int sum = 0;
			while(num!=0)
			{
				int rem = num % 10;
				sum +=rem*rem*rem;
				num = num/10;
			}
			
			if(temp==sum)
			{
				System.out.println("Armstrong");
			}
			else
			{
				System.out.println("Not Armstrong");
			}
	}
}