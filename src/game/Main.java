package game;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame fr=new JFrame();
		Gameplay gmaeplay = new Gameplay();
		fr.setBounds(10, 10,700 , 600);
		fr.setTitle("Breakout Ball");
		fr.setResizable(false);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fr.add(gmaeplay);
	
	}

}