import java.util.Scanner;
import java.io.*;

public class validator {

	private static String get_user;
	private static int get_pin;
	
	
	public static String getUser(String u, String filename){
		
		get_user = u;
		Scanner reader = new Scanner(filename);
		File file = new File(filename);
		
		while(reader.hasNextLine()) {
			
			get_user = reader.nextLine();
		}
		
		return get_user;
	}
	
	public static int getpin(int pin, String filename) throws FileNotFoundException {
		
		get_pin = pin;
		File pinFile = new File(filename);
		Scanner reader = new Scanner(pinFile);
		
		while(reader.hasNextInt()) {
			
			
			get_pin = reader.nextInt();
			
			
		}
		
		return get_pin;
	}
	
}
