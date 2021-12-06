package model;

/**
 * Interface that acts as "Subject" in Observer pattern.
 */
public interface Value {
	/**
	 * Method that adds Observer.
	 * @param observer  Observer to be added.
	 */
	public void addObserver(Observer observer);
	
	/**
	 * Method that removes Observer.
	 * @param observer  Observer to be removed.
	 */
	public void removeObserver(Observer observer);
	
	/**
	 * Method that sets value.
	 * @param value  double value to be set.
	 */
	public void setValue(double value);
}
