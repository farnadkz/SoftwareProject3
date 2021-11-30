package main;

import javax.swing.JFrame;
import controller.MenubarListener;
import view.ConverterPanel;
import view.MenuBar;

/**
 * The main class.
 */
public class ConverterApp {
	/**
	 * The main method.
	 */
	public static void main(String[] args) {
		JFrame convFrame = new JFrame(" ");
		ConverterPanel convPanel = new ConverterPanel();
		MenubarListener menubarListener = new MenubarListener(convPanel);
		MenuBar convMenuBar = new MenuBar(menubarListener);
		convFrame.add(convPanel);
		convFrame.setJMenuBar(convMenuBar);
		convFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		convFrame.setSize(600, 600);
		convFrame.setLocationRelativeTo(null);
		convFrame.setResizable(false);
		convFrame.setVisible(true);
	}

}
