

public class Calculator {

	
	static double a,b;
	static String operation;
	static boolean repeat = true;
	
public static void main(String[] args) {
	try {
	//Create object of the class InputReader and first input read
	InputReader obj = new InputReader();
	a = obj.read();
	//Required operation
	System.out.println("Enter the operation +, -, *, /");
	while (repeat) {
	
	switch (obj.operation())
	{
	case "+" : 
			   b = obj.read();
			   a += b;
			   obj.display(a);
			   break;
			   
	case "-" : b = obj.read();
			   a -= b;
			   obj.display(a);
			   break;
			   
	case "*" : b = obj.read();
			   a *= b;
			   obj.display(a);
			   break;
			   
	case "/" : b = obj.read();
			   a /= b;
			   obj.display(a);
			   break;
	case "Y" : System.out.println("Thank you for using the application");
				repeat = false;
				break;
	default: System.out.println("Enter the correct operator +, -, *, /,  OR To exit Enter Y" );
				break;
		
			}
		
		}
	
	} 
	catch (Exception e)
	{
		System.out.println("Enter the numbers only..!");
	}

	}
		
}
