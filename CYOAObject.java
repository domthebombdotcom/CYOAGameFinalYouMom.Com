package CYOA;
import java.util.*;

public class CYOAObject extends CYOADriver {
//implementation of scanner and instance variables
	Scanner input = new Scanner(System.in);
	String choice = "";

//first scenario
	public String[] SenarioOne(String[] args, int life, String name) {
		
		
		System.out.println("Thats when a boulder hits, sendign you flying and once you regain"
				+ " consiousness you see flaming shards of brick and wood rain down around you"
				+ "\nin a raging fury.You can smell the blood, sweat, and steel  as it burns your"
				+ " nostrils as you struggle to regain your consciousness. \nStruggling to stand, "
				+ "beads of sweat running down your temple you fall in the mud. you notice"
				+ " the ground beginning to get darker\n and as you look up you see a cloud of"
				+ " arrows start to rise above the horizon. ");
//prompting user the options for Scenario one
		System.out.println("\ntype 1, 2, 3, or 4 and either grab the sheild of a fallen soldier,"
				+ "try and run to the rock on your left for cover, Use someone as a sheild"
				+ "\n ,or try and use magic");
		
//options for scenarioOne
		choice = input.next().toLowerCase();
		if(choice.equals("1")) {
			
			System.out.println("Desperately you claw at the mud trying to inch yourself closer to"
					+ " \nthe fallen soldier, and as you grab the shield, quickly raising it above"
					+ " \nyour head just inches away from getting an arrow to the face they slam into"
					+ " \nthe ground with as much force and speed as an angry English teacher."
					+ " \nYou feel one pierce your right thigh and watch as one penetrates the shield"
					+ " \nand hits your shoulder sending waves of pain throughout your body. \r\n");
			
			life = 1;
			System.out.println("\nName: " + name + "              Lives: " + life);

			
			
		} else if(choice.equals("2")) {
			
			System.out.println("As you go to run for cover all the dizziness and confusion from"
					+ " \ngetting knocked out sends you falling right back on your feet."
					+ " \nArrows pierce your legs and back sending waves of shock throughout your body"
					+ " \nand before the shock can kill you steve comes and hits the orange justice on"
					+ " \nyou while you get riddles with holes from the arrows. lUCKY for your "
					+ " \nreal name SHAGGY!!!!!!!");
			
			life = 2;
			System.out.println("\nName: " + name + "              Lives: " + life);
			
		} else if(choice.equals("3")) {
			
			System.out.println("Taking your paring knife out of your holster you desperately swing at"
					+ " \nthe ankles of a soldier. Cutting the skin like butter he falls, and in a panic"
					+ " \nof fight or flight reactions you both roll around in the mud struggling to"
					+ " \noverpower the other. With a swift movement he's on top of you swinging over"
					+ " \nand over, but before you know it arrows rain down killing him. I guess god is"
					+ " \non your side!\r\n");
			
			life = 3;
			System.out.println("\nName: " + name + "              Lives: " + life);

			
		} else {
			
			System.out.println("Chanting abracadabra alakazam the ground begins to shake and your"
					+ " \neyes begin to roll into the back of your head and louder you chant"
					+ " \nabracadabra alakazam the skies shatter and the earth cracks and louder "
					+ "\nyou shout abracadabra alakazam screaming fades in the background as people"
					+ " \nfall into the earth but before you know it you have lost control your"
					+ " \nmind melting and your consciousness fading, causing the end of the world"
					+ " \nand a new beginning for the price of your life. ");
			
			life = 0;
			System.out.println("\nName: " + name + "              Lives: " + life);
			System.out.println("\nGAME OVER");
			return args;
			
		}
		return args;
	}

//second scenario
	public String[] SenarioTwo(String[] args, int life, String name) {
//asks user if they like game or not 

		System.out.println("Yes or No do you like the game so far?");
		choice = input.next().toLowerCase();
		
		if(choice.equals("yes")) {
			System.out.println("a lightning bolt strikes inches from you!I guess you got lucky ;)");
			
		} else {
			System.out.println("a bolt of lightning strikes you and you plop dead on the ground"
					+ "\n GAME OVER");
			return args;
			
		}
		
//tells second scenario
		System.out.println(" anywayssssss... you watch as the Galhai breach the main gate."
				+ " \nReaching for your staff you send a message via telepathy out to all of the"
				+ " \nother mages to help you in a group spell to wipe out the remaining forces. ");
		
		System.out.println("\ntype 1, 2, 3, or 4 you can either Crush them all with a giant meteor"
				+ " from outer space, Use Fairy magic to turn them all into unicorns, "
				+ "\nUse mind control on them, or Send a wave of fireballs their way");
		
		choice = input.next().toLowerCase();
		if(choice.equals("1")) {
			System.out.println("Raising your staff in the air as it started to glow brighter and"
					+ " \nbrighter with surges of energy coursing through your veins you close"
					+ " \nyour eyes and imagine the meteor. It feels heavy. But slowly it"
					+ " \napproaches breaking through the earth's atmospheric layers crashing into"
					+ " \nthe earth killing everyone with a single bang. But also destroying the"
					+ " \nearth too.");
			
			life = 0;
			System.out.println("\nName: " + name + "              Lives: " + life);
			System.out.println("\nGAME OVER");
			
		} else if (choice.equals("2")) {
			System.out.println("Clouds drift in and lighting crashes but in the storm glitter"
					+ " \nfalls transforming all the enemy soldiers into unicorns twisting and"
					+ "\n mending their bones together as they endure the transformation"
					+ "\nAnd stopping to admire their beauty, it is short lived. Stamping their"
					+ "\n feet in the mud getting ready to charge they hurl themselves at you"
					+ "\n stabbing you through the heart. ");
			
			life = 0;
			System.out.println("\nName: " + name + "              Lives: " + life);
			System.out.println("\nGAME OVER");
			
		} else if (choice.equals("3")) {
			System.out.println("You decide to use mind control. Sadly however you never really"
					+ " \nactually payed attention in wizarding academy for rich preppy kids"
					+ " \nand so you didnt learn the spells you kind of just winged it."
					+ " \nSoooooo you instead actually made the enemy stronger and they came and"
					+ " finished you. xD");
			
			life = 0;
			System.out.println("\nName: " + name + "              Lives: " + life);
			System.out.println("\nGAME OVER");
			
		} else {
			System.out.println("small particles of light form inthe air all around the field."
					+ "\nSlowly taking shape and forming massive flaming balls of fire"
					+ "\nhurling through the air they strike the Galhai scorching them to ashes"
					+ "\nwith the fire spreading the smoke and ash makes you feel weaker.");
			
			if(life > 1) {
				System.out.println("with the last bit of strength you manage to reach a small pond."
						+ "\nand emersing yourself in the water and letting it flow across you burns"
						+ "\nyou look up and see the castle and home which you once knew being burnt"
						+ "\nbut you have survived ");
				
				System.out.println("\nCONGRATS YOU BEAT THE GAME!!!");
				return args;
				
			} else {
				System.out.println("smoke slowly fills your lungs knocking you out unconsious. "
						+ "\nand as you lie there o nthe ground darkness and cold slowly creeping in "
						+ "you steve hits the dab."
						+ "\n GAME OVER  ");
				return args;
				
			}
		}
		
		return args;
	}
}
