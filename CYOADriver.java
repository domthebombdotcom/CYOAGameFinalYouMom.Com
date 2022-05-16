package CYOA;
import java.util.*;

public class CYOADriver {
	
	public static void main(String[] args) {
//implementation of scanner and instance variables
		Scanner input = new Scanner(System.in);
		boolean con = true;
		int life = 3;
		CYOAObject story = new CYOAObject();
		
		while(con == true) {
//beginning of game asks user for name and displays opening credits 
			System.out.println("the war between the golden order and the Galhai continues to rage "
					+ "\nonwards and in a desperate last push forwards they have decided to make one last"
					+ "\npush against us! its our duty to stop them from breaching our walls!");
			System.out.println("Hello! Soldire snap out of it! Whats ya name boy!:" );
			String chara = input.next();
			System.out.println("\nName: " + chara + "              Lives: 3");
//calls method in CYOAObject that starts scenario one and two
			
			story.SenarioOne(args, 0, chara);
			
			if(life >= 1) {
				story.SenarioTwo(args, 3, chara);
			}
			
//used to end the game and prompts user to quit game or restart 	
			System.out.println("\nYou have reached the end! (q) to quit (r) to restart!");
			String end = input.next().toLowerCase();
			
			if(end.equals("q")) {
				System.out.println("have a good day!");
				con = false;
				
			} else if (end.equals("r")) {
				main(args);
				
			}
			con = false;
		}
		
		
		

	}

}
