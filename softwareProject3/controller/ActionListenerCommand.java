package controller;

/**
 * Interface that implemented by ActionUpdate.
 * Note: this method is part of the "Command Pattern".
 * Specifically, the Command interface.
 */
public interface ActionListenerCommand {
	/**
	 * Method to be implemented by Actions.
	 * @param value  double to be passed.
	 */
	public void execute(double value);
}
