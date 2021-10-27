import java.util.Scanner;
import java.io.*;
public class test {

	public static void main(String[] args)throws FileNotFoundException, InterruptedException {
		// Create needed objects
		String ans;
		
		PrintWriter file = new PrintWriter("Users.txt");
		PrintWriter PINs = new PrintWriter("PINS.txt");
		System.out.println("Test---------------------------------------------------------------:\n");
		Thread.sleep(1000);
		Scanner input = new Scanner(System.in);
		System.out.println("Are you a current registered user? (y/n)---------------------------:\n");
		ans = input.nextLine();
		
		if(ans.equals("y")) {
		
			user_val();
			pin_val();
			full_game();
		}
		else {
			
			guest();
			
			String ans2;
			toolkit new_user = new toolkit();
			toolkit.creat_pin();
			toolkit.getName();
			
			System.out.println("Weclome "+toolkit.getName()+"\nwould you like to start a new game? ");
			ans2 = input.nextLine();
			
			if(ans2.equals("y") || ans2.equals("yes")) {
				
				full_game();
				
			}
			
		}
		System.out.println("Later");
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(1000);
		System.out.println("Suckers!");
		Thread.sleep(1000);
		System.out.println(".____.\r\n"
				+ "   xuu$``$$$uuu.\r\n"
				+ " . $``$  $$$`$$$\r\n"
				+ "dP*$  $  $$$ $$$\r\n"
				+ "?k $  $  $$$ $$$\r\n"
				+ " $ $  $  $$$ $$$\r\n"
				+ " \":$  $  $$$ $$$\r\n"
				+ "  N$  $  $$$ $$$\r\n"
				+ "  $$  $  $$$ $$$\r\n"
				+ "   $  $  $$$ $$$\r\n"
				+ "   $  $  $$$ $$$\r\n"
				+ "   $  $  $$$ $$$\r\n"
				+ "   $  $  $$$ $$$\r\n"
				+ "   $  $  $$$ $$$\r\n"
				+ "   $$#$  $$$ $$$\r\n"
				+ "   $$'$  $$$ $$$\r\n"
				+ "   $$`R  $$$ $$$\r\n"
				+ "   $$$&  $$$ $$$\r\n"
				+ "   $#*$  $$$ $$$\r\n"
				+ "   $  $  $$$ @$$\r\n"
				+ "   $  $  $$$ $$$\r\n"
				+ "   $  $  $$$ $$$\r\n"
				+ "   $  $  $B$ $$&.\r\n"
				+ "   $  $  $D$ $$$$$muL.\r\n"
				+ "   $  $  $Q$ $$$$$  `\"**mu..\r\n"
				+ "   $  $  $R$ $$$$$    k  `$$*t\r\n"
				+ "   $  @  $$$ $$$$$    k   $$!4\r\n"
				+ "   $ x$uu@B8u$NB@$uuuu6...$$X?\r\n"
				+ "   $ $(`RF`$`````R$ $$5`\"\"\"#\"R\r\n"
				+ "   $ $\" M$ $     $$ $$$      ?\r\n"
				+ "   $ $  ?$ $     T$ $$$      $\r\n"
				+ "   $ $F H$ $     M$ $$K      $  ..\r\n"
				+ "   $ $L $$ $     $$ $$R.     \"d$$$$Ns.\r\n"
				+ "   $ $~ $$ $     N$ $$X      .\"    \"%2h\r\n"
				+ "   $ 4k f  $     *$ $$&      R       \"iN\r\n"
				+ "   $ $$ %uz!     tuuR$$:     Buu      ?`:\r\n"
				+ "   $ $F          $??$8B      | '*Ned*$~L$\r\n"
				+ "   $ $k          $'@$$$      |$.suu+!' !$\r\n"
				+ "   $ ?N          $'$$@$      $*`      d:\"\r\n"
				+ "   $ dL..........M.$&$$      5       d\"P\r\n"
				+ " ..$.^\"*I$RR*$C\"\"??77*?      \"nu...n*L*\r\n"
				+ "'$C\"R   ``\"\"!$*@#\"\"` .uor    bu8BUU+!`\r\n"
				+ "'*@m@.       *d\"     *$Rouxxd\"```$\r\n"
				+ "     R*@mu.           \"#$R *$    !\r\n"
				+ "     *%x. \"*L               $     %.\r\n"
				+ "        \"N  `%.      ...u.d!` ..ue$$$o..\r\n"
				+ "         @    \".    $*\"\"\"\" .u$$$$$$$$$$$$beu...\r\n"
				+ "        8  .mL %  :R`     x$$$$$$$$$$$$$$$$$$$$$$$$$$WmeemeeWc\r\n"
				+ "       |$e!\" \"s:k 4      d$N\"`\"#$$$$$$$$$$$$$$$$$$$$$$$$$$$$$>\r\n"
				+ "       $$      \"N @      $?$    F$$$$$$$$$$$$$$$$$$$$$$$$$$$$>\r\n"
				+ "       $@       ^%Uu..   R#8buu$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$>\r\n"
				+ "                  ```\"\"*u$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$>\r\n"
				+ "                         #$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$>\r\n"
				+ "                          \"5$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$>\r\n"
				+ "                            `*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$>\r\n"
				+ "                              ^#$$$$$$$$$$$$$$$$$$$$$$$$$$$$$>\r\n"
				+ "                                 \"*$$$$$$$$$$$$$$$$$$$$$$$$$$>\r\n"
				+ "                                   `\"*$$$$$$$$$$$$$$$$$$$$$$$>\r\n"
				+ "                                       ^!$$$$$$$$$$$$$$$$$$$$>\r\n"
				+ "                                           `\"#+$$$$$$$$$$$$$$>\r\n"
				+ "                                                 \"\"**$$$$$$$$>\r\n"
				+ "                                                        ```\"\"");
		
		
		PINs.close();
		file.close();
		}
	public static String user_val() throws FileNotFoundException {
		//validate if user is registered.
		
	    	Scanner input = new Scanner(System.in);
			String user;
			System.out.println("What is your username? ");
			user = input.nextLine();
			validator valid = new validator();
			validator.getUser(user, "Users.txt");
			return user;
	}
	
	public static int pin_val() throws FileNotFoundException {
		//validate if user is registered.
		
	    	Scanner input = new Scanner(System.in);
			int pin;
			System.out.println("What is your PIN? ");
			pin = input.nextInt();
			validator valid = new validator();
			validator.getpin(pin, "PINS.txt");
			
			return pin;
	}
	
	public static void full_game() throws InterruptedException {
		
		
		System.out.println("Wecolme to the revolver game!");
		Thread.sleep(400);
		System.out.println(" _                \r\n"
				+ "                    | |               \r\n"
				+ " _ __ _____   _____ | |_   _____ _ __ \r\n"
				+ "| '__/ _ \\ \\ / / _ \\| \\ \\ / / _ \\ '__|\r\n"
				+ "| | |  __/\\ V / (_) | |\\ V /  __/ |   \r\n"
				+ "|_|  \\___| \\_/ \\___/|_| \\_/ \\___|_| ");
		
		int players;
		revolver gun = new revolver();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many people are playing?");
		players = keyboard.nextInt();
		// An array that holds the player names has been given a scope from input
		String[] names = new String[players];
		
		for(int x = 0; x < players; x++) {
			
			System.out.println("Whos is player number " + x);
			names[x] = keyboard.nextLine();
			
			
			
			System.out.println(names[x]  + gun.mag(names[x]));
			
			
			
			}
		
			System.out.println("Later");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
			System.out.println("Suckers!");
			Thread.sleep(1000);
			System.out.println(".____.\r\n"
					+ "   xuu$``$$$uuu.\r\n"
					+ " . $``$  $$$`$$$\r\n"
					+ "dP*$  $  $$$ $$$\r\n"
					+ "?k $  $  $$$ $$$\r\n"
					+ " $ $  $  $$$ $$$\r\n"
					+ " \":$  $  $$$ $$$\r\n"
					+ "  N$  $  $$$ $$$\r\n"
					+ "  $$  $  $$$ $$$\r\n"
					+ "   $  $  $$$ $$$\r\n"
					+ "   $  $  $$$ $$$\r\n"
					+ "   $  $  $$$ $$$\r\n"
					+ "   $  $  $$$ $$$\r\n"
					+ "   $  $  $$$ $$$\r\n"
					+ "   $$#$  $$$ $$$\r\n"
					+ "   $$'$  $$$ $$$\r\n"
					+ "   $$`R  $$$ $$$\r\n"
					+ "   $$$&  $$$ $$$\r\n"
					+ "   $#*$  $$$ $$$\r\n"
					+ "   $  $  $$$ @$$\r\n"
					+ "   $  $  $$$ $$$\r\n"
					+ "   $  $  $$$ $$$\r\n"
					+ "   $  $  $B$ $$&.\r\n"
					+ "   $  $  $D$ $$$$$muL.\r\n"
					+ "   $  $  $Q$ $$$$$  `\"**mu..\r\n"
					+ "   $  $  $R$ $$$$$    k  `$$*t\r\n"
					+ "   $  @  $$$ $$$$$    k   $$!4\r\n"
					+ "   $ x$uu@B8u$NB@$uuuu6...$$X?\r\n"
					+ "   $ $(`RF`$`````R$ $$5`\"\"\"#\"R\r\n"
					+ "   $ $\" M$ $     $$ $$$      ?\r\n"
					+ "   $ $  ?$ $     T$ $$$      $\r\n"
					+ "   $ $F H$ $     M$ $$K      $  ..\r\n"
					+ "   $ $L $$ $     $$ $$R.     \"d$$$$Ns.\r\n"
					+ "   $ $~ $$ $     N$ $$X      .\"    \"%2h\r\n"
					+ "   $ 4k f  $     *$ $$&      R       \"iN\r\n"
					+ "   $ $$ %uz!     tuuR$$:     Buu      ?`:\r\n"
					+ "   $ $F          $??$8B      | '*Ned*$~L$\r\n"
					+ "   $ $k          $'@$$$      |$.suu+!' !$\r\n"
					+ "   $ ?N          $'$$@$      $*`      d:\"\r\n"
					+ "   $ dL..........M.$&$$      5       d\"P\r\n"
					+ " ..$.^\"*I$RR*$C\"\"??77*?      \"nu...n*L*\r\n"
					+ "'$C\"R   ``\"\"!$*@#\"\"` .uor    bu8BUU+!`\r\n"
					+ "'*@m@.       *d\"     *$Rouxxd\"```$\r\n"
					+ "     R*@mu.           \"#$R *$    !\r\n"
					+ "     *%x. \"*L               $     %.\r\n"
					+ "        \"N  `%.      ...u.d!` ..ue$$$o..\r\n"
					+ "         @    \".    $*\"\"\"\" .u$$$$$$$$$$$$beu...\r\n"
					+ "        8  .mL %  :R`     x$$$$$$$$$$$$$$$$$$$$$$$$$$WmeemeeWc\r\n"
					+ "       |$e!\" \"s:k 4      d$N\"`\"#$$$$$$$$$$$$$$$$$$$$$$$$$$$$$>\r\n"
					+ "       $$      \"N @      $?$    F$$$$$$$$$$$$$$$$$$$$$$$$$$$$>\r\n"
					+ "       $@       ^%Uu..   R#8buu$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$>\r\n"
					+ "                  ```\"\"*u$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$>\r\n"
					+ "                         #$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$>\r\n"
					+ "                          \"5$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$>\r\n"
					+ "                            `*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$>\r\n"
					+ "                              ^#$$$$$$$$$$$$$$$$$$$$$$$$$$$$$>\r\n"
					+ "                                 \"*$$$$$$$$$$$$$$$$$$$$$$$$$$>\r\n"
					+ "                                   `\"*$$$$$$$$$$$$$$$$$$$$$$$>\r\n"
					+ "                                       ^!$$$$$$$$$$$$$$$$$$$$>\r\n"
					+ "                                           `\"#+$$$$$$$$$$$$$$>\r\n"
					+ "                                                 \"\"**$$$$$$$$>\r\n"
					+ "                                                        ```\"\"");
	}
	public static void guest() throws InterruptedException {
		
		Scanner ans = new Scanner(System.in);
		String response;
		
		System.out.println("Would you like to play as guest ?");
		response = ans.nextLine();
		
		if(response.equals("y") || response.equals("Yes") || response.equals("yes")) {
			
			full_game();
			
		}
		
		
		
		
	}
	
	
	
	
}
	
	
	
