import java.util.Scanner;

public class toolkit {

	private static int pin; 
	private static String name;
	
	
	public static int creat_pin() {
		
		Scanner input = new Scanner(System.in);
		

		System.out.println("Please create a PIN numebr:-------------");
		pin = input.nextInt();
		System.out.println("PIN successfully created! ");
		
		return pin;
	}
	
	public static String getName() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name:-------------");
		name = input.nextLine();
		
		
		return name;
	}
	
	public String toString() {
		
		String current_user = "name:-------------\n"+name+"\nPIN:-------------\n"+pin;
		
		
		return current_user;
	}
	
	
}
