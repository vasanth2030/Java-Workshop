import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Start of code");
		System.out.println("Enter two numbers: ");

		/*
		 * try { throw new ArithmeticException(); } catch(ArithmeticException e) {
		 * System.out.println("Throw exception has been caught"); }
		 */

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int answer = division(num1, num2);
		System.out.println(answer);

		System.out.println("Exception has been successfully handled!");

		System.out.println("Finally block is executed always");

		System.out.println("Rest of the code");
	}

	public static int division(int a, int b) throws Exception{
		try {
		return a / b;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception occured");
		}
		return -1;
	}

}
