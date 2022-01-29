import java.util.Scanner;

public class Invoke extends Operations{
	boolean repet = true;
	int a,b,result;
	String check;
	Scanner sc = new Scanner(System.in);
	
	public void add() {
		
		System.out.println("Enter the first number");
		a = sc.nextInt();
		System.out.println("Enter the number to Add");
		b = sc.nextInt();
		while(repet)
		{
			
			a = a + b;
			System.out.println("Result : "+ a);
			System.out.println("For quit type exit or enter the numbeer to add");
			check = sc.next();
			//check = check.toString();
			String hu = check.toLowerCase();
					String rt = "exit";
			if(hu != rt)
			{
				repet = false;
			}
			b = Integer.parseInt(check);			
			
		}
		
	}
	
	@Override
	public void div(int funmber, int snumber) {
		
		result = a - b;
		System.out.println("Result : "+ result);
		
	}
	
	@Override
	public void mul(int funmber, int snumber) {
		
		result = a * b;
		System.out.println("Result : "+ result);
		
	}
	
	@Override
	public void sub(int funmber, int snumber) {
		
		result = a / b;
		System.out.println("Result : "+ result);
		
	}

}
