package logical;

public class primenumber {

	public static void main(String[] args) {
		for(int j=3;j<=100;j++) {
			int number=j;
			int flag =0;
		        for(int i=3;i<number;i++) {
		        	if(number%i==0) {
		        		flag=1;
		        		break;
		        	}
		        }
		        if(flag==0)
		        {
		        	System.out.println(number+ "Prime Number");
		        }
		        else
		        {
//		        	System.out.println(number+ "Not Prime Number");
		        }
			}
		}
	}