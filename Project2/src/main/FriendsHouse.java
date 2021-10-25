package main;

public class FriendsHouse {

	static String[] friendsHouseObjects = {
			"dresser", "plant", "door"
		};
	
	public FriendsHouse() {
		
		TextGame game = new TextGame();
		
		Houseinit();
		HouseMain();
	}
	
	static void Houseinit() {
		String PLACE = "friendsHouse";
		System.out.println("You walk into your friend's house.");
		System.out.println("What are you even doing in here?: ");
	}
	
	static void HouseMain(){
		String interactWith;
		
		String command = checkInput(inputs);
		switch (command) {
			case "use":
				System.out.println("What are you going to use: ?");
				interactWith = checkInput(friendsHouseObjects);
				
				switch (interactWith) {
					case "dresser":
						System.out.println("Wow, you're nosy. You walk over to his dresser and try"
								+ " to open a drawer.");
						System.out.println("The drawer won't open because the game developers are "
								+ "poor college kids who don't have enough time to code something "
								+ "inside.");
						break;
					case "plant":
						System.out.println("At first you were impressed your friend could keep a p"
								+ "lant alive longer than you did, but when you pick it you realiz"
								+ "ed it's fake.");
					case "door":
						"You exit into the townSquare."
						TownSquare();
					default:
						HouseMain();
				}
				
				break;
				
			case "look":
				System.out.println("You see a dresser in the corner because you have eyes. You probably could snoop around in it since you have hands too.");
			    System.out.println("You also spot a plant like the one at your house, only this one is actually alive.");
				break;
				
			case "visit":
				TextGame.visit();
				break;
				
			case "check inventory":
				checkInv();
				break;
				
			case "help":
				TextGame.help();
				break;				
		}
		HouseMain();
	}
}
