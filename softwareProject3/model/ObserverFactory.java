package model;

import view.ConverterPanel;

/**
 * This class returns specific types of Observers.
 * Note: this class implements the "Factory" pattern.
 *
 */
public class ObserverFactory {
	
	/**
	 * Method returns Observer type depending on input
	 * @param type  String describing type of desired Observer.
	 * @param panel  ConverterPanel to be operated on.
	 * @return Observer type that was asked for.
	 */
	public static Observer getObserver(String type, ConverterPanel panel) {
		if(type.equalsIgnoreCase("meters")) {
			return new MeterConversionObserver(panel);
		}else if(type.equalsIgnoreCase("feet")) {
			return new FeetConversionObserver(panel);
		}else {
			return null;
		}
	}
}
