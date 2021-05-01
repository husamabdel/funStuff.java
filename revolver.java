import java.util.Random;
public class revolver {

	// this class generates a random 
	
	String name;
	private int randy;
	
	
	
	public String mag(String n) {
		
		n = name;
		String ss = "Is alive";
		Random rand = new Random();
		randy = rand.nextInt(6);
		
		if(randy == 1) 
			
			ss = "Is Dead";
			
			return ss;
			
		}
	
	
}

