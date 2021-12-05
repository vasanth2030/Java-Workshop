import java.util.Scanner;

public class ProjectDemo {

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
		System.out.println("===========================");

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
			System.out.println("Enter a valid choice");
			mainPage();

		}
	}

	public static void addition() {
		System.out.println("Enter two values");
		int num1 = sc.nextInt();
		System.out.println("+");
		int num2 = sc.nextInt();
		System.out.println("= "+ (num1 + num2));
		mainPage();
	}
	
	public static void subtraction() {
		System.out.println("Enter two values");
		int num1 = sc.nextInt();
		System.out.println("-");
		int num2 = sc.nextInt();
		System.out.println("= "+ (num1-num2));
		mainPage();
	}
	
	public static void multiplication() {
		System.out.println("Enter two values");
		int num1 = sc.nextInt();
		System.out.println("x");
		int num2 = sc.nextInt();
		System.out.println("= "+(num1 * num2));
		mainPage();
	}
	public static void division() {
		System.out.println("Enter two values");
		int num1 = sc.nextInt();
		System.out.println("/");
		int num2 = sc.nextInt();
		
		try {
		System.out.println("= "+(num1 / num2));
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
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		System.out.print(num+"!= ");
		int fact=1;
		for(int i=2;i<=num;i++)
		{
			fact*=i;
		}
		System.out.print(fact);
		System.out.println();
		mainPage();
	}
}
