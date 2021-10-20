package Handlers;

import main.*;
import java.awt.event.*;

public class Input implements KeyListener{
	
	int option = 0,
		optionSelect;
	String[] option2 = {"Use","Look","Visit","Check Inventory","Help"};
	
	public void Option(int optionSelect){
	/*
		switch (option) {
			case 1:
				if (optionSelect == -3) {
					optionSelect = 0;
				}
				break;
			case 2:
				if (optionSelect == 1 || optionSelect == -3) {
					optionSelect = 0;
				}
				break;
			case 3:
				if (optionSelect == -1 || optionSelect == 3) {
					optionSelect = 0;
				}
				break;
			case 4:
				if (optionSelect == 1) {
					optionSelect = -2;
				}
				break;
		}
	*/
		option += optionSelect;
		if (option < 0) option = 0;
		else if (option > 4) option = 4;
		getOption(option);
		System.out.println(option2[option]);
	}
	
	public int getOption() {
		return option;
	}
	public int getOption(int option) {
		return option;
	}
	
	public void Confirm(){
		option = getOption();
		System.out.println(option2[option] + " is selected");
	}
	
	@Override
	public void keyTyped(KeyEvent e) {		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
		switch(e.getKeyCode()) {
		//Left
			case 37:
			case 65:
				Option(-1);
				break;
		/*
		//Up
			case 38:
			case 87:
				Option(-3);
				break;
		*/
		//Right
			case 39:
			case 68:
				Option(1);
				break;
		/*
		//Down
			case 40:
			case 83:
				Option(3);
				break;
		*/
		//Back
			case 8:
				//Back();
				break;
		//Confirm
			case 10:
				Confirm();
				break;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
	}
	
}
