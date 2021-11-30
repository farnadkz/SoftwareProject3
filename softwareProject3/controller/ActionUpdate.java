package controller;

import model.ValueToConvert;

/**
 * This class implements ActionListenerCommand.
 * Note: this class is a ConcreteCommand in the "Command Pattern".
 */
public class ActionUpdate implements ActionListenerCommand{
	private ValueToConvert converter;
	
	/**
	 * Constructor that initializes this class.
	 * @param converter  ValueToConvert that will be acted upon.
	 */
	public ActionUpdate(ValueToConvert converter) {
		this.converter = converter;
	}
	
	/**
	 * Implementation of execute(double).
	 * @param value  double value to be passed.
	 */
	public void execute(double value) {
		converter.setValue(value);
	}
}
