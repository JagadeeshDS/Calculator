import java.util.Scanner;

public class InputReader {
	double a;
	Scanner sc = new Scanner(System.in);
	
	
	public double read()
	{		
		System.out.println("Enter the number");
		while (true) {
	        String input = sc.next();
	        try {
	            a = Double.parseDouble(input);
	            break;
	        } catch (NumberFormatException ne) {
	            System.out.println("Enter numbers only");
	        }
	    }		
		return a;
	}
	
	public void display(double a)
	{
		System.out.println(a);
		System.out.println("For Continue the operation +, -, *, /,   To exit Enter Y");
		
	}
	
	public String operation()
	{
		return sc.next().toUpperCase();
	}

}
