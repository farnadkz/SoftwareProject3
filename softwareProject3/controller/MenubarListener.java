package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ObserverFactory;
import model.ValueToConvert;
import view.ConverterPanel;

/**
 * Class that listens and acts when the menubar is clicked.
 * Note: in the Command pattern and the Observer pattern, this class acts as the "Client".
 * Also acts as the "FactoryPatternDemo" in the Factory pattern.
 */
public class MenubarListener implements ActionListener{
	private final ValueToConvert converter;
	private final ConverterPanel panel;
	
	/**
	 * Constructor that gets ValueToConvert and initializes its Observers using the ObserverFactory.
	 * @param panel  ConverterPanel to be operated on.
	 */
	public MenubarListener(ConverterPanel panel) {
		this.panel = panel;
		converter = ValueToConvert.getInstance();
		converter.addObserver(ObserverFactory.getObserver("feet", panel));
		converter.addObserver(ObserverFactory.getObserver("meters", panel));
	}
	
	/**
	 * This method is activated when the menubar option is clicked.
	 * @param e  ActionEvent to be triggered.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		double value = this.panel.getValue();
		ActionListenerCommand update = new ActionUpdate(this.converter);
		MenuOptions menu = new MenuOptions(update);
		menu.update(value);
	}
}
