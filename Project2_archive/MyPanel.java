package main;
import Handlers.*;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MyPanel extends JPanel{
	int height = 600,
		width = 800;
	Dimension size = new Dimension(width,height);
	//Auto resizes using proportions from the height and width (maintaining a 600 x 800 ratio)
	int boxBuffer 		= width / 20,
		boxWidth 		= width - (boxBuffer * 2),
		menuBoxHeight 	= height/6,
		menuBoxY 		= height - menuBoxHeight - boxBuffer,
		textBoxHeight 	= height - width/2 - boxBuffer,
		textBoxY 		= height - textBoxHeight - textBoxHeight - boxBuffer / 15;
	
	Input input = new Input();
	JPanel menuBox;
	
	public MyPanel(){
		JPanel textBox = new JPanel();
		textBox.setBounds(boxBuffer, textBoxY, boxWidth, textBoxHeight);
		textBox.setBorder(BorderFactory.createMatteBorder(2,2,2,2, Color.white));
		textBox.setBackground(Color.black);

		menuBox = new JPanel();
		menuBox.setBounds(boxBuffer, menuBoxY, boxWidth, menuBoxHeight);
		menuBox.setBorder(BorderFactory.createMatteBorder(2,2,2,2, Color.white));
		menuBox.setBackground(Color.black);
		menuBox.setLayout(null);

		this.add(textBox);
		MenuOption();
		this.add(menuBox);
		
		this.setLayout(null);
		this.setPreferredSize(size);
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(input);
	}
	
	public void MenuOption() {
		JLabel useM = new JLabel("Use");
			useM.setBounds(50,0,100,100);
			useM.setForeground(Color.white);
			useM.setFont(new Font("Calibri", Font.PLAIN, 25));
			menuBox.add(useM);
		
		JLabel lookM = new JLabel("Look");
			lookM.setBounds(150,0,100,100);
			lookM.setForeground(Color.white);
			lookM.setFont(new Font("Calibri", Font.PLAIN, 25));
			menuBox.add(lookM);
			
		JLabel visitM = new JLabel("Visit");
			visitM.setBounds(275,0,100,100);
			visitM.setForeground(Color.white);
			visitM.setFont(new Font("Calibri", Font.PLAIN, 25));
			menuBox.add(visitM);
			
		JLabel inventoryM = new JLabel("Check Inventory");		
			inventoryM.setBounds(400,0,200,100);		
			inventoryM.setForeground(Color.white);
			inventoryM.setFont(new Font("Calibri", Font.PLAIN, 25));
			menuBox.add(inventoryM);
			
		JLabel helpM = new JLabel("Help");
			helpM.setBounds(625,0,100,100);
			helpM.setForeground(Color.white);
			helpM.setFont(new Font("Calibri", Font.PLAIN, 25));
			menuBox.add(helpM);
	}
	/*
	public void setMenuOptionColor(int option) {
	
		useOption.setForeground(Color.gray);
		visitOption.setForeground(Color.gray);
		helpOption.setForeground(Color.gray);
		lookOption.setForeground(Color.gray);
		inventoryOption.setForeground(Color.gray);
		
		switch (option) {
			case 0:
				useOption.setForeground(Color.white);
				break;
			case 1:
				visitOption.setForeground(Color.white);
				break;
			case 2:
				helpOption.setForeground(Color.white);
				break;
			case 3:
				lookOption.setForeground(Color.white);
				break;
			case 4:
				inventoryOption.setForeground(Color.white);
				break;
		}
	}
	*/
	/*
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
	}
	*/
}
