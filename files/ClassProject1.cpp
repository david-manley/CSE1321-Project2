#include <iostream>
using namespace std;



    int main() {
        
        string name, command, place, object;
        place = "home";
        bool gameCompleted, playerAlive, caveMap;
        caveMap = false;
        playerAlive = true;
        gameCompleted = false;
        cout << "WELCOME TO CS ADVENTURE GAME. TO START, PLEASE ENTER YOUR NAME: " << endl;
        getline(cin, name);
        while (playerAlive && !gameCompleted) {
            if (place.compare("home") == 0) {
                cout << "You are in your house right now" << endl;
                cout << "(" << name << "): I was thinking of going on an adventure. I should visit the treasure cave to see if I can found it..." << endl;
                cout << "What are you going to do?" << endl;
                getline(cin, command);
                if (command.compare("visit") == 0) {
                    cout << "Where do you want to go?";
                    getline(cin, place);
                    cout << "(" << name << "): I am going to " <<
                            place << endl;


                } else if (command.compare("look") == 0) {
                    cout << "You are currently in your house. There are not too much things to interact with because you are on a mission" << endl;
                } else if (command.compare("help") ==0) {
                    cout << "This game contain 3 basic commands" << endl;
                    cout << "-visit: Use it to travel to a different places (home, library, or cave)" << endl;
                    cout << "-look: Use it to get a current description of the place" << endl;
                    cout << "-use: Use it to interact with a object in the scene" << endl;
                }
            } else if (place.compare("library") == 0) {
                cout << "*You are in the library right now*" << endl;
                cout << "(" + name + "): I didn't know there was a cave section in the library. I will be around..." << endl;
                cout << "What are you going to do?" << endl;
                getline(cin, command);
                if (command.compare("visit") == 0) {
                    cout << "Where do you want to go?";
                    getline(cin, place);
                    cout << "(" << name << "): I am going to " <<
                            place << endl;
                } else if (command.compare("look") == 0) {
                    cout << "You are currently in the library and you see a (map) of the city cave. It seems useful!" << endl;
                } else if (command.compare("use") == 0) {
                    cout << "What would you like to read?" << endl;
//here there seems to be an error in the PseudoCode should add a print line to know how to read objects
                    getline(cin, object);
                    if (object.compare("map") == 0) {
                        cout << "You read the map and took a picture of it. Now you know the place like the palm of your hand" << endl;
                        caveMap = true;
                    }
                } else if (command.compare("help") == 0) {
                    cout << "This game contain 3 basic commands" << endl;
                    cout << "-visit: Use it to travel to a different place (home, library, or cave)" << endl;
                    cout << "-look: Use it to get a current description of the place" << endl;
                    cout << "-use: Use it to interact with a object in the scene" << endl;
                }
            } else if (place.compare("cave") == 0) {
                cout << "You are in the front of treasure cave right now" << endl;
                cout << "(" + name + "): It's bigger that it seems outside, I better found a map on the library to not get lost..." << endl;
                cout << "What are you going to do?" << endl;
                getline(cin, command);
                if (command.compare("visit") == 0) {
                    cout << "Where do you want to go?";
                    getline(cin, place);
                    cout << "(" << name << "): I am going to " <<
                            place << endl;
                } else if (command.compare("look") == 0) {
                    cout << "You are currently in the cave and you see a (door). It seems useful to get it!" << endl;
                } else if (command.compare("use") == 0) {
                    cout << "What would you like to use?" << endl;
                    getline(cin, object);
                    if (object.compare("door") == 0) {
                        cout << "You entered in and the door got stuck.." << endl;
                        if (caveMap = true) {
                            cout << "You know the place, so you will be able to find another exit" << endl;
                            cout << "In the way you found a treasure with a lot of gold coins and saved it to pay your college" << endl;
                            gameCompleted = true;
                        } else {
                            cout << "You got so scared and started kicking the door. Then you got lost in the cave and never found a way out" << endl;
                            playerAlive = false;
                        }
                    }
                } else if (command.compare("help") == 0) {
                    cout << "You got so scared and started kicking the door. Then you got lost in the cave and never found a way out" << endl;
                    cout << "This game contain 3 basic commands" << endl;
                    cout << "-visit: Use it to travel to a different place (home, library, or cave)" << endl;
                    cout << "-look: Use it to get a current description of the place" << endl;
                    cout << "-use: Use it to interact with a object in the scene" << endl;
                }
            }
        }
        if (playerAlive == true) {
            cout << "Congratulations, " << name << "! YOU WIN!" << endl;
        } else {
            cout << "So sorry, " << name << " YOU LOSE!" << endl;
        }

        return 0;
    }


