import java.util.Scanner;

public class ClassProject1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, command, place, object;
        place = "home";
        boolean gameCompleted, playerAlive, caveMap;
        caveMap = false;
        playerAlive = true;
        gameCompleted = false;
        System.out.println("WELCOME TO CS ADVENTURE GAME. TO START, PLEASE ENTER YOUR NAME: ");
        name = sc.nextLine();
        while (playerAlive && !gameCompleted) {
            if (place.equals("home")) {
                System.out.println("You are in your house right now");
                System.out.println("(" + name + "): I was thinking of going on an adventure. I should visit the treasure cave to see if I can found it...");
                System.out.println("What are you going to do?");
                command = sc.nextLine();
                if (command.equals("visit")) {
                    System.out.print("Where do you want to go?");
                    place = sc.nextLine();
                    System.out.println("(" + name + "): I am going to " +
                            place);


                } else if (command.equals("look")) {
                    System.out.println("You are currently in your house. There are not too much things to interact with because you are on a mission");
                } else if (command.equals("help")) {
                    System.out.println("This game contain 3 basic commands");
                    System.out.println("-visit: Use it to travel to a different places (home, library, or cave)");
                    System.out.println("-look: Use it to get a current description of the place");
                    System.out.println("-use: Use it to interact with a object in the scene");
                }
            } else if (place.equals("library")) {
                System.out.println("*You are in the library right now*");
                System.out.println("(" + name + "): I didn't know there was a cave section in the library. I will be around...");
                System.out.println("What are you going to do?");
                command = sc.nextLine();
                if (command.equals("visit")) {
                    System.out.print("Where do you want to go?");
                    place = sc.next();
                    System.out.println("(" + name + "): I am going to " +
                            place);
                } else if (command.equals("look")) {
                    System.out.println("You are currently in the library and you see a (map) of the city cave. It seems useful!");
                } else if (command.equals("use")) {
                    System.out.println("What would you like to read?");
//here there seems to be an error in the PseudoCode should add a print line to know how to read objects
                    object = sc.nextLine();
                    if (object.equals("map")) {
                        System.out.println("You read the map and took a picture of it. Now you know the place like the palm of your hand");
                        caveMap = true;
                    }
                } else if (command.equals("help")) {
                    System.out.println("This game contain 3 basic commands");
                    System.out.println("-visit: Use it to travel to a different place (home, library, or cave)");
                    System.out.println("-look: Use it to get a current description of the place");
                    System.out.println("-use: Use it to interact with a object in the scene");
                }
            } else if (place.equals("cave")) {
                System.out.println("You are in the front of treasure cave right now");
                System.out.println("(" + name + "): It's bigger that it seems outside, I better found a map on the library to not get lost...");
                System.out.println("What are you going to do?");
                command = sc.nextLine();
                if (command.equals("visit")) {
                    System.out.print("Where do you want to go?");
                    place = sc.nextLine();
                    System.out.println("(" + name + "): I am going to " +
                            place);
                } else if (command.equals("look")) {
                    System.out.println("You are currently in the cave and you see a (door). It seems useful to get it!");
                } else if (command.equals("use")) {
                    System.out.println("What would you like to use?");
                    object = sc.nextLine();
                    if (object.equals("door")) {
                        System.out.println("You entered in and the door got stuck..");
                        if (caveMap = true) {
                            System.out.println("You know the place, so you will be able to find another exit");
                            System.out.println("In the way you found a treasure with a lot of gold coins and saved it to pay your college”");
                            gameCompleted = true;
                        } else {
                            System.out.println("You got so scared and started kicking the door. Then you got lost in the cave and never found a way out");
                            playerAlive = false;
                        }
                    }
                } else if (command.equals("help")) {
                    System.out.println("You got so scared and started kicking the door. Then you got lost in the cave and never found a way out");
                    System.out.println("This game contain 3 basic commands");
                    System.out.println("-visit: Use it to travel to a different place (home, library, or cave)");
                    System.out.println("-look: Use it to get a current description of the place");
                    System.out.println("-use: Use it to interact with a object in the scene");
                }
            }
        }
        if (playerAlive == true) {
            System.out.println("Congratulations, " + name + "! YOU WIN!");
        } else {
            System.out.println("So sorry, " + name + " YOU LOSE!");
        }


    }

    }
