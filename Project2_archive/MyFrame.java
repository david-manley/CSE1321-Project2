package main;
import javax.swing.*;

@SuppressWarnings("serial")
public class MyFrame extends JFrame{
	 
	MyPanel panel = new MyPanel();
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
	  
		this.pack();
		this.setLayout(null);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	 }
}
