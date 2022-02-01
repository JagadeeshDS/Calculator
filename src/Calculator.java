import java.util.Scanner;
//test purpose
public class Calculator {
		static double a,b,result;
		static String operation;
		
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		a = sc.nextDouble();
		
		while (true) {
		System.out.println("Enter the operation +, -, *, /");
		operation = sc.next();
		switch (operation) {
		case "+" : System.out.println("Enter the number");
				   b = sc.nextDouble();
				   a += b;
				   System.out.println("Result "+ a);
				   break;
				   
		case "-" : System.out.println("Enter the number");
				   b = sc.nextDouble();
				   a -= b;
				   System.out.println("Result "+ a);
				   break;
				   
		case "*" : System.out.println("Enter the number");
				   b = sc.nextDouble();
				   a *= b;
				   System.out.println("Result "+ a);
				   break;
				   
		case "/" : System.out.println("Enter the number");
				   b = sc.nextDouble();
				   a /= b;
				   System.out.println("Result "+ a);
				   break;		   

		default: System.out.println("Enter the correct operator");
			break;
			}
		
		}
		
	}

}
