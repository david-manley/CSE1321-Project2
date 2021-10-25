package mainGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	static String NAME;
	String PLACE = "game";
	static String[] commandList = {"use","look","visit","check inventory","help"};
	
	static Scanner sc = new Scanner(System.in);
	
	/*public static void main(String[] args) {
		boolean running = true;
		
		init();
		
		do{
			
		} while (running);
	}
	*/
	static String checkInput(String [] inputs) {
		String input = "";
		boolean isInput = false;
		
		while (!isInput) {
			System.out.println("Your choice are as follows: ");
			for (int i = 0; i < inputs.length; i++) {
				System.out.println(inputs[i] + ", ");
			}
			System.out.println();
			System.out.print("Please enter an option: ");
			input = sc.next();
			sc.nextLine();
			for (int i = 0; i < inputs.length; i++) {
				if (input.equals(inputs[i])) {
					isInput = false;
					return input;
				}
			}
		}
		return input;
	}
	
	static void visit(String PLACE) {
		String command;
		ArrayList<String> visitInput = new ArrayList<String>();
		visitInput.removeAll(visitInput);
		
		switch (PLACE) {
			case "home":
				visitInput.add("Town Square");
				visitInput.add("Library Entrance");
				break;
			case "friendsHouse":
				visitInput.add("Town Square");
				break;
			case "libraryEntrance":
				visitInput.add("");
				break;
			case "libraryFrontSection":
				break;
			case "libraryBackSection":
				break;
			case "townSquare":
				break;
		}
		System.out.println("Where does "+NAME+" want to go today I wonder?");
		
		
	}
	
	static void help() {
		System.out.println("There are four main commands in this game: ");
		System.out.println("Help - provides a list of game commands. ");
		System.out.println("Visit - allows you to travel bewteen the three main areas in the adven"
				+ "ture game. Type visit, and hit enter. You'll then be prompted with a list of lo"
				+ "cations to travel to");
		System.out.println("Use - allows you to use the items you've gathered thus far. If you use"
				+ " an item in the world, you will pick it up. If you interact with certain world "
				+ "objects, you will be asked which item you want to use");
		System.out.println("Check Inventory - Allows you to see what items you've gathered");
		System.out.println("Look - Allows you to look around your area for items that you can inte"
				+ "ract with");
	}
	
	static void init(){
		String command;
		
		System.out.println("Welcome to \"THE COLLEGE EXPERIENCE\" created by Hon CSE 1321 in the f"
				+ "all of 2021");
		System.out.println("This game works by special commands.");
		help();
		System.out.println("Game comencing in three, two, one...");
		System.out.println();
		System.out.println("We begin our story by taking a look at a specific college student, dow"
				+ "n on his luck, doing some brain storming on what to do about the money problem "
				+ "of college life");
		System.out.print("What would this college students name be?: " );
		NAME = sc.nextLine();
		System.out.println("Inspriation strikes!! as the college student named" + NAME +" decided what to do! What did the college student do?: ");
		command = checkInput(commandList);
		switch (command) {
			case "use":
			case "look":
			case "visit":
			case "check inventory":
			case "help":
			default:
				help();
		}
	}
}
