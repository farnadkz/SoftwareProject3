package controller;

/**
 * This class acts as the "Invoker" in the Command pattern.
 */
public class MenuOptions {
	ActionListenerCommand update;
	
	/**
	 * Constructor that stores ConcreteCommand.
	 * @param update  ActionListenterCommand to be stored and executed.
	 */
	MenuOptions(ActionListenerCommand update){
		this.update = update;
	}
	
	/**
	 * This method calls the execute method in the ConcreteCommand.
	 * @param value  double to be passed on.
	 */
	public void update(double value) {
		update.execute(value);
	}
}
