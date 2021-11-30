package model;

/**
 * Observer interface used for "Observer" pattern.
 */
public interface Observer {
	/**
	 * Update method to be implemented.
	 * @param value  double value to be used.
	 */
	public void update(double value);
}
