/*
Was just bored so i created a quick little game that plays out as a russian roulette, Basically the revolver class
creates an object that takes your name and puts it in the mag function that uses the random object to create a 6 shooter 
revolver. the random object randomly creates a number between 1 and 6 and the bullet is the number 1 so while the 
random number generated by the random object is 1, the name is declared dead and thus looses, a do-while loop was added for 
you to play with your friends.
*/

import java.util.Scanner;
public class Shimgapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//numb of players in your game
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
		System.out.println("       __xxxxxxxxxxxxxxxx___.\n"
				+ "                        _gxXXXXXXXXXXXXXXXXXXXXXXXX!x_\n"
				+ "                   __x!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!x_\n"
				+ "                ,gXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXx_\n"
				+ "              ,gXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!_\n"
				+ "            _!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!.\n"
				+ "          gXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXs\n"
				+ "        ,!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!.\n"
				+ "       g!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!\n"
				+ "      iXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!\n"
				+ "     ,XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXx\n"
				+ "     !XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXx\n"
				+ "   ,XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXx\n"
				+ "   !XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXi\n"
				+ "  dXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n"
				+ "  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!\n"
				+ "  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!\n"
				+ "  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n"
				+ "  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n"
				+ "  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!\n"
				+ "  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!\n"
				+ "  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!\n"
				+ "  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!\n"
				+ "  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n"
				+ "  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n"
				+ "  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n"
				+ "  !XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n"
				+ "   XXXXXXXXXXXXXXXXXXXf~~~VXXXXXXXXXXXXXXXXXXXXXXXXXXvvvvvvvvXXXXXXXXXXXXXX!\n"
				+ "   !XXXXXXXXXXXXXXXf`       'XXXXXXXXXXXXXXXXXXXXXf`          '~XXXXXXXXXXP\n"
				+ "    vXXXXXXXXXXXX!            !XXXXXXXXXXXXXXXXXX!              !XXXXXXXXX\n"
				+ "     XXXXXXXXXXv`              'VXXXXXXXXXXXXXXX                !XXXXXXXX!\n"
				+ "     !XXXXXXXXX.                 YXXXXXXXXXXXXX!                XXXXXXXXX\n"
				+ "      XXXXXXXXX!                 ,XXXXXXXXXXXXXX                VXXXXXXX!\n"
				+ "      'XXXXXXXX!                ,!XXXX ~~XXXXXXX               iXXXXXX~\n"
				+ "       'XXXXXXXX               ,XXXXXX   XXXXXXXX!             xXXXXXX!\n"
				+ "        !XXXXXXX!xxxxxxs______xXXXXXXX   'YXXXXXX!          ,xXXXXXXXX\n"
				+ "         YXXXXXXXXXXXXXXXXXXXXXXXXXXX`    VXXXXXXX!s. __gxx!XXXXXXXXXP\n"
				+ "          XXXXXXXXXXXXXXXXXXXXXXXXXX!      'XXXXXXXXXXXXXXXXXXXXXXXXX!\n"
				+ "          XXXXXXXXXXXXXXXXXXXXXXXXXP        'YXXXXXXXXXXXXXXXXXXXXXXX!\n"
				+ "          XXXXXXXXXXXXXXXXXXXXXXXX!     i    !XXXXXXXXXXXXXXXXXXXXXXXX\n"
				+ "          XXXXXXXXXXXXXXXXXXXXXXXX!     XX   !XXXXXXXXXXXXXXXXXXXXXXXX\n"
				+ "          XXXXXXXXXXXXXXXXXXXXXXXXx_   iXX_,_dXXXXXXXXXXXXXXXXXXXXXXXX\n"
				+ "          XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXP\n"
				+ "          XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!\n"
				+ "           ~vXvvvvXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXf\n"
				+ "                    'VXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXvvvvvv~\n"
				+ "                      'XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~\n"
				+ "                  _    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXv`\n"
				+ "                 -XX!  !XXXXXXX~XXXXXXXXXXXXXXXXXXXXXX~   Xxi\n"
				+ "                  YXX  '~ XXXXX XXXXXXXXXXXXXXXXXXXX`     iXX`\n"
				+ "                  !XX!    !XXX` XXXXXXXXXXXXXXXXXXXX      !XX\n"
				+ "                  !XXX    '~Vf  YXXXXXXXXXXXXXP YXXX     !XXX\n"
				+ "                  !XXX  ,_      !XXP YXXXfXXXX!  XXX     XXXV\n"
				+ "                  !XXX !XX           'XXP 'YXX!       ,.!XXX!\n"
				+ "                  !XXXi!XP  XX.                  ,_  !XXXXXX!\n"
				+ "                  iXXXx X!  XX! !Xx.  ,.     xs.,XXi !XXXXXXf\n"
				+ "                   XXXXXXXXXXXXXXXXX! _!XXx  dXXXXXXX.iXXXXXX\n"
				+ "                   VXXXXXXXXXXXXXXXXXXXXXXXxxXXXXXXXXXXXXXXX!\n"
				+ "                   YXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXV\n"
				+ "                    'XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!\n"
				+ "                    'XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXf\n"
				+ "                       VXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXf\n"
				+ "                         VXXXXXXXXXXXXXXXXXXXXXXXXXXXXv`\n"
				+ "                          ~vXXXXXXXXXXXXXXXXXXXXXXXf`\n"
				+ "                              ~vXXXXXXXXXXXXXXXXv~\n"
				+ "                                 '~VvXXXXXXXV~~\n"
				+ "                                       ~~");
		
	}

	
}
