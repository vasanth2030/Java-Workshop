import java.util.*;

public class IfElseConditions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * System.out.println("Enter your age: ");
		 * 
		 * int age= sc.nextInt();
		 * 
		 * if(age>18) { System.out.println("You are an adult now"); } else {
		 * System.out.println("You are not an adult now!!"); }
		 * 
		 * System.out.println("END OF CODE!!");
		 */
		
		
		
		/*
		 * System.out.println("Enter a number: ");
		 * 
		 * int num= sc.nextInt();
		 * 
		 * if(num%2==0) { System.out.println("Even number!"); }
		 * 
		 * else { System.out.println("Odd number!"); }
		 */
		
		
		/*
		 * System.out.println("Enter your marks");
		 * 
		 * int marks = sc.nextInt();
		 * 
		 * if(marks>=80) { System.out.println("A+"); }
		 * 
		 * else if(marks>60 && marks<=79) { System.out.println("B"); }
		 * 
		 * else if(marks>30 && marks<=59) { System.out.println("C"); }
		 * 
		 * else { System.out.println("D"); }
		 */
		
		System.out.println("Enter a year: ");
		
		int year = sc.nextInt();
		
		if(year%400==0 || (year%100!=0 && year%4==0))
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a leap Year");
		}
		
	}

}
