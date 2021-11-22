package view;

import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 * This class creates the menubar that the client will click on.
 */
public class MenuBar extends JMenuBar{
	/**
	 * Constructor that adds the menu.
	 * @param menubarListener  ActionListener to be triggered.
	 */
	public MenuBar(ActionListener menubarListener) {
	super();
	JMenu gameMenu = new JMenu("Update Model");
	gameMenu.add(createMenuItem("Save input centimeters", menubarListener));
	super.add(gameMenu);
	}

/**
 * The method specifies the text and keyboard shortcut of the option.
 * @param text  String to appear on the option.
 * @param listener  ActionListener to activate when clicked.
 * @return JMenuItem that saves the cm input.
 */
private JMenuItem createMenuItem(String text, ActionListener listener) {
	JMenuItem menuItem = new JMenuItem(text);
	menuItem.addActionListener(listener);
	menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.ALT_DOWN_MASK));
	return menuItem;
}
}
