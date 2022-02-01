import java.util.Scanner;


public class Calculator {

	static Scanner sc = new Scanner(System.in);
	static double a,b,result;
	static String operation;
	static boolean repeat = true;
	
public static void main(String[] args) {
	try {
		
	//Reading the First input number
	System.out.println("Enter the first number");
	a = sc.nextDouble();
	System.out.println("Enter the operation +, -, *, /");
	while (repeat) {
	//Reading the operation input
	//System.out.println("Enter the operation +, -, *, /");
	operation = sc.next().toUpperCase();
	System.out.println();
	switch (operation) {
	case "+" : System.out.println("Enter the number");
			   b = sc.nextDouble();
			   a += b;
			   System.out.println("Result "+ a);
			   System.out.println("For Continue the operation +, -, *, /,   To exit Enter Y");
			   break;
			   
	case "-" : System.out.println("Enter the number");
			   b = sc.nextDouble();
			   a -= b;
			   System.out.println("Result "+ a);
			   System.out.println("For Continue the operation +, -, *, /,   To exit Enter Y");
			   break;
			   
	case "*" : System.out.println("Enter the number");
			   b = sc.nextDouble();
			   a *= b;
			   System.out.println("Result "+ a);
			   System.out.println("For Continue the operation +, -, *, /,   To exit Enter Y");
			   break;
			   
	case "/" : System.out.println("Enter the number");
			   b = sc.nextDouble();
			   a /= b;
			   System.out.println("Result "+ a);
			   System.out.println("For Continue the operation +, -, *, /,   To exit Enter Y");
			   break;
	case "Y" : System.out.println("Thank you for using the application");
				repeat = false;
				break;
	default: System.out.println("Enter the correct operator +, -, *, /,  OR Tto exit Enter Y" );
				break;
		
		}
		
	}
	
	} catch (Exception e) {
		System.out.println("Enter the numbers only..!");
	}
	
	
	
	}
		
}
