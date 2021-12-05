import java.util.Scanner;

public class CalculatorProject {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		mainPage();
	}

	public static void mainPage() {
		System.out.println("======== CALCULATOR ========");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Factorial");
		System.out.println("6. Exit");
		System.out.println("=============================");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			addition();
			break;
		case 2:
			subtraction();
			break;
		case 3:
			multiplication();
			break;
		case 4:
			division();
			break;
		case 5:
			factorial();
			break;
		case 6:
			System.out.println("Thank you for using the Calculator!");
			System.exit(0);
			break;
		default:
			System.out.println("Enter a valid choice!");
			mainPage();

		}

	}
	
	public static void addition()
	{
		System.out.println("Enter two numbers: ");
		int num1=sc.nextInt();
		System.out.println("+");
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("= "+sum);
		mainPage();
		
	}

	public static void subtraction()
	{
		System.out.println("Enter two numbers: ");
		int num1=sc.nextInt();
		System.out.println("-");
		int num2=sc.nextInt();
		int diff=num1-num2;
		System.out.println("= "+diff);
		mainPage();
		
	}
	public static void multiplication()
	{
		System.out.println("Enter two numbers: ");
		int num1=sc.nextInt();
		System.out.println("x");
		int num2=sc.nextInt();
		int prod=num1*num2;
		System.out.println("= "+prod);
		mainPage();
		
	}
	public static void division()
	{
		System.out.println("Enter two numbers: ");
		int num1=sc.nextInt();
		System.out.println("/");
		int num2=sc.nextInt();
		try {
		int div=num1/num2;
		System.out.println("= "+div);
		}
		catch(Exception e)
		{
			System.out.println("Number cannot be divided by zero!");
			division();
		}
		mainPage();
		
	}
	
	
	public static void factorial()
	{
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		
		System.out.println(num+"! = "+fact);
		mainPage();
	}

}
