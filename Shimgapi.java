import java.util.Scanner;
public class Shimgapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n;
		String x;
	revolver shoot = new revolver();	
	Scanner keyboard = new Scanner(System.in);	
	String cont;
	System.out.println("Welcome to the russian roulette game!");
	do {
		
		
		System.out.println("What is your name?");
		n = keyboard.nextLine();
		x = shoot.mag(n);
		
		System.out.println( n + " Is " + x);
		System.out.println("Would you like to Add another name? (y/n) ");
		cont = keyboard.nextLine();
		
	}
	while(cont.equals("y"));
	
	}

	
	
	
	
	
	
	
}
