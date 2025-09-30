package basic;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char choice;
		
		do{  
		System.out.println("----- Simple Calculator (if-else) -----");
		
		System.out.println("Enter The First Number:");
		int a = sc.nextInt();
		
		System.out.println("Enter The Second Number:");
		int b = sc.nextInt();
		
		System.out.println("Choose an operation: +, -, *, /,%");
        char operator = sc.next().charAt(0);
        
        int result = 0;
        
        if (operator == '+'){
            result = a + b;
            System.out.println("Result: " + result);
        } 
        else if (operator == '-') {
            result = a - b;
            System.out.println("Result: " + result);
        } 
        else if (operator == '*') {
            result = a * b;
            System.out.println("Result: " + result);
        } 
        else if (operator == '/') {
            if (b != 0) {
                result = a / b;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error! Division by zero.");
            }
        } 
        else if (operator == '%') {
            if (b != 0) {
                result = a %b;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error! Division by zero.");
            }
        } 
        else {
            System.out.println("Invalid operator!");
        }
        System.out.print("Do you want to continue? (y/n): ");
        choice = sc.next().charAt(0);

    } while (choice == 'y');
	}
}