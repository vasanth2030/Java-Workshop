import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		
		/*
		 * Scanner sc= new Scanner(System.in);
		 * System.out.println("Enter three values: "); int num1= sc.nextInt(); int num2
		 * = sc.nextInt(); int num3= sc.nextInt(); int greatestNumber =
		 * greatestOfThreeNumbers(num1, num2, num3);
		 * System.out.println(greatestNumber+" is the greatest number");
		 */	
		
		Methods ms=new Methods();
		ms.helloWorld();
		ms.helloWorld();
		
		System.out.println(greatestOfThreeNumbers(10, 20, 30));
		ms.helloWorld();
	}
	
	public static int greatestOfThreeNumbers(int a, int b, int c)
	{
		if(a>=b && a>=c)
		{
			return a;
		}
		else if(b>=a && b>=c)
		{
			return b;
		}
		else 
			return c;
		
	}
	
	public void helloWorld()
	{
		System.out.println("Hello World!");
		
	}
	
	

}
