package basic;

public class Contidinal {

	public static void main(String[] args) {
		
		// marks = 40 [0-100]
				
				// 91-100 :A
				// 71-90  :B
				// 51-70  :C
				// 36-50  :D
				// 0-35   :F
				// invalid input 
		
		
//		System.out.println("Enter the Marks 0 to 100");
		 int marks=93 ;
		 
		 if (marks >= 91 && marks <= 100) 
		 {
	            System.out.println("Grade: A");
	     } 
		 else if (marks >= 71 && marks <= 90) 
		 {
	            System.out.println("Grade: B");
	     } 
		 else if (marks >= 51 && marks <= 70) 
		 {
	            System.out.println("Grade: C");
	     } 
		 else if (marks >= 36 && marks <= 50) 
		 {
	            System.out.println("Grade: D");
	     } 
	     else if (marks >= 0 && marks <= 35) 
	     {
	            System.out.println("Grade: F");
	     } 
	     else 
	     {
	            System.out.println("Invalid Input!");
	      }
		 
	}

}
