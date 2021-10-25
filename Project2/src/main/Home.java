package main;

public class Home {
	
	public Home()
	{
		if (place== "Home") {
			System.out.println(NAME + " is at their home... It's a dump.");
			System.out.println("What does " + NAME + " wanna do?!");

			command= checkInput(inputs, command);
			if (command== "visit") {
				place= visit(place);
			}

			if (command== "help") {
				help();
			}

			if (command== "check inventory") {
				checkInventory();
			}

			if (command== "look") {
				System.out.println(NAME + " see's a book, a record player, a dirty plastic bowl, a cracked tv, several dead plants, and a desk. There is a library card on the desk.");
			}

			if (command== "use") {
				System.out.println("What are you gonna use " + NAME + "?");

				String[] houseObjects;

				if (!(hasItem("libraryPass"))) {
					houseObjects= {"book","record player","plastic bowl","tv","dead plant","library card","cave passage"};
					command= checkInput(houseObjects);
				} else if (hasItem("libraryPass")) {
					houseObjects= {"book","record player","plastic bowl","tv","dead plant","cave passage"};
					command= checkInput(houseObjects);
				}

				if (interactWith== "cave passage") {
					place= "cave";
				} else if (interactWith== "book") {
					System.out.println(NAME + " picks up the book and opens it... Chapters 4-8 fall out of the book :/");
				} else if (interactWith== "record player") {
					System.out.println(NAME + " presses play on the record player and is rick rolled.");
				} else if (interactWith== "plastic bowl") {
					System.out.println(NAME + " picks up the plastic bowl and then sets it back down.");
				} else if (interactWith== "tv") {
					System.out.println(NAME + " turns on the tv and Spongebob appears on the screen!");
				} else if (interactWith== "dead plant") {
					System.out.println(NAME + " smells the dead plant... Why " + NAME + " is doing this I have no clue ¯\_(ツ)_/¯");
				} else if (interactWith== "library card") {
					if (!(hasItem("library card"))) {
						System.out.println(NAME + " has picked up the library card.");
						addItemToInv("libraryPass");
					}
				}

			}
		}
	}
}
