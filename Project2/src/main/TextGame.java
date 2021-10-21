package main;

import java.util.Scanner;

public class TextGame {
	private String NAME = "";
	private String PLACE = "home";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to \"THE COLLEGE EXPERIENCE\" created by Hon CSE 1321 in the fall of 2021");
		String[] inputs = {"use","look","visit","check inventory","help"};
		String command = "";
		boolean play = true;
		System.out.println("This game works by special commands.");
		//lists the commands using the help method
		help();
		System.out.println("Game comencing in three, two, one...");
		do
		{
			System.out.println("We begin out story by taking a look at a specific college student, down "+
					"on his luck, doing some brain storming on what to do about the money problem of college life");
			System.out.print("What would this college students name be?: ");
			String name = sc.next();
			System.out.println("Inspiration strikes!! as the college student named "+name+" decided to do! What did the colllege student do? ");
			command = checkInput(inputs);
			if(command == "visit")
			{
				place = visit(place);
			}
			if(command == "help")
			{
				help();
			}
			
			String gameplay="";
			String[] options = {"Y","N"};
			System.out.print("Do you want to control the life of a college student user again? Ener Y for yes and N for no.");
			gamePlay = checkInput(options);
			if (gamePlay.equals("Y"))
			{
				play = true;
			}
			else if(gameplay.equals("N"))
			{
				play = false;
			}
			
		}while(play == true);
		System.out.println("GAME OVER");

	}

}
