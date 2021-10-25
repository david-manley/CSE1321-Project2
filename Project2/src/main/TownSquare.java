package main;

public class TownSquare {
	
	public TownSquare()
	{
		if (place == "townSquare"){
			System.out.println("You walk into the town square and see a farmer's stand and a flower stall.");
			System.out.println("So, what are you doing now?: ");

			command = checkInput(inputs);

			if (command== "visit"){
				place= visit(place);
			}

			if (command== "help") {
				help();
			}

			if (command== "look")  {
				System.out.println("Oh yeah, you can see your friend's house from here.");
				System.out.println("But I already said, there's a flower stall and a farmer's stand here!");
			}

			if (command == use)   {
				String action1;
				System.out.println("Which one would you like to go to?: ");
				String[] squareOptions = {"farmer's stand", "flower stall", "friend's house"};
				action1 = checkInput(squareOptions);
				if (action1 == "farmer's stand")
				{
					System.out.println("You see the fruits and veggies the stand has but you're too broke to afford any of it.");
				} else if (action1 == "flower stall") {
					System.out.println("You look at all the different flowers at the stand. " + NAME + " should probably get their mom some flowers if they ever find the treasure.");
				} else if (action1 == "friend's house") {
					place = "friendsHouse";
				}
		      	}

		      	if (command == "check inventory")   {
				checkInv();
	    		}

	    	}
	}
}
