package com.krishna.gaming;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.krishna.gaming.utiles.GameConstants;

public class GameFrame extends JFrame implements GameConstants {
	
	public GameFrame() throws IOException {
		setResizable(false);
		// This line is to close the window screen of game
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle(TITLE);
		
		// This line is to max size window screen of game 
//		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setSize(GWIDTH,GHEIGHT);
		// to set window Screen at center 
		setLocationRelativeTo(null);
		Board board = new Board();
		add(board);
	
		//This is jframe property  l
		setVisible(true);
		
	}

}
