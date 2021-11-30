package model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class stores the centimeter value.
 * Acts as "Receiver" in Command pattern.
 * Acts as "ConcreteSubject" in Observer pattern.
 * Also implements Singleton pattern.
 */
public class ValueToConvert implements Value{
	private static ValueToConvert uniqueInstance;
	protected List<Observer> observers = new ArrayList<Observer>();
	private double value;
	
	/**
	 * Private constructor.
	 */
	private ValueToConvert() {
		this.value = 0;
	}
	
	/**
	 * This method returns unique instance of ValueToConvert.
	 * @return ValueToConvert that is unique instance.
	 */
	public static ValueToConvert getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new ValueToConvert();
		}
		return uniqueInstance;
	}
	
	/**
	 * This method adds Observer.
	 * @param observer  Observer to be added.
	 */
	public synchronized void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	/**
	 * This method removes an Observer.
	 * @param observer  Observer to be removed.
	 */
	public synchronized void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	/**
	 * This method updates the value of each Observer.
	 * @param value  double to be used in update.
	 */
	public void setValue(double value) {
		this.value = value;
		observers.forEach(observer -> observer.update(value));
	}
}
