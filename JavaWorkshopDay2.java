import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaWorkshopDay2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name: ");
		
		String name = br.readLine();
		
		System.out.println("Enter your age: ");
		
		int age= Integer.parseInt(br.readLine());
		
		System.out.println("Your name is "+name);
		
		System.out.println("Your age is "+age);
		

	}

}
