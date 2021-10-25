package main;
import java.util.Random;
import java.util.Scanner;

public class Cave {
	
	public static void cave(String NAME, String PLACE, String command, String[] inputs) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int numberChoice;
		int correctNumber;
		boolean over = false;
	
		if (PLACE == "cave") {
			System.out.print(NAME + " has decided to visit the cave behind their house. They've travelled through the cave passageway, and arrived in their current location.");
			System.out.print(NAME + " recalls that many, many people have gone missing in this cave while looking for treasure.");
			if ((Inventory.hasItem("realMap") || (Inventory.hasItem("fakemap")))) {
				System.out.print("Luckily, " + NAME + "+ found a treasure map, and is able to traverse the cave safely (for the most part).");
			}
			    
			while(!over) {
		
				System.out.print("What will " + NAME + " do now I wonder? Hopefully give up this foolish adventure before they get lost in the cave like their predecessors.");
				command = TextGame.checkInput(inputs);
				
				switch(command.toLowerCase()) {
					case "visit" :
						PLACE = TextGame.visit(PLACE);
						break;
					case "help" :
						TextGame.help();
						break;
					case "look" :
						System.out.print(NAME + " decides to look around. Besdies the rather boring stalagtites, there are only two things of note: the passage that " 
											+ NAME + " came from, and a path going deeper into the cave. ");	
						break;
					case "check inventory" :
						Inventory.checkInv(NAME);
						break;
					case "use" :
						System.out.print("I wonder, which object would " + NAME +" like to use?: ");
						String[] caveObjects = {"cave exit" , "cave path"};
						String interactWith = TextGame.checkInput(caveObjects);
						
						if (interactWith == "cave exit") {
							System.out.print(NAME + " has decided to  make the smart choice, and leaves through the cave exit to go back to their home.");
							PLACE = "home";
						}
					
						else if (interactWith == "cave path") {
							System.out.print("Unfortunately, " + NAME + " has decided to continue with their foolish quest, and venturee deep into the mysterious cave.");
							System.out.print("By sheer luck, " + NAME + " happens to stumble upon the location of the treasure, but as they take a step toward it,"
											+ " they are able to hear the click of a pressure plate. ");
							System.out.print("IT'S A TRAP!");
							
							if (Inventory.hasItem("real map")) {
								System.out.print("Fortunately, " + NAME + " knew of this because of the old treasure map they found! They are 50 percent confident that they will be able to succeed in disarming the trap!");
								System.out.print(NAME + " must now pick a number, 1 or 2: ");
								numberChoice = sc.nextInt();
								correctNumber = rand.nextInt(2);
								if (numberChoice == correctNumber) {
									System.out.print("Thankfully, " + NAME + "has picked correctly, and successfully disarmed the trap, allowing them to get the treasure!");
									Inventory.addItemToInv("treasure", NAME);
								}
								else {
									//else{} is not in the pseudocode	
									System.out.print("Unfortunately, " + NAME + " has picked the wrong number and not allowed to get the treasure! ");
								}
							} else if (Inventory.hasItem("map")) {
								System.out.print("Unfortunately," + NAME + " was unaware of this because the treasure map they found was a fake!");
								System.out.print(NAME + " must now pick a number from 1- 50: ");
								numberChoice = sc.nextInt();
								correctNumber = rand.nextInt(50);
								if (numberChoice ==  correctNumber) {
									System.out.print("Wow. Just....I don't even know what to say anymore. " + NAME+ "'s luck is just too good, and they've somehow managed to disarm the trap completely by accident...");
									Inventory.addItemToInv("treasure", NAME);
								}
								else {
									//else{} is not in the pseudocode	
									System.out.print("Unfortunately, due to either poor planning or bad luck, \" + NAME + \" has fallen victim to the trap, and will never be heard from again. ");
								}
							}
							if (Inventory.hasItem("treasure")) {
								if (Inventory.hasItem("real map")) {
									System.out.print("Thanks to " + NAME + "'s hard work and thorough searching, they have successfully managed to take home their treasure without dying in the process. This means they can finally get the education that they deserve!");	
								}
								else {
									System.out.print("Unfortunately, due to either poor planning or bad luck, " + NAME + " has fallen victim to the trap, and will never be heard from again. ");
								}
							
								
							}
			
						}
						break;
					default: 
						System.out.print("This is not a valid action.");
						continue;
				}
				
			}
		
		}			
	}
}
