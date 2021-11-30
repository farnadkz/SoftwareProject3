package model;

import view.ConverterPanel;

/**
 * This class updates the feetConversionArea and acts as a "ConcreteObserver" in Observer pattern.
 */
public class FeetConversionObserver implements Observer{
	protected ConverterPanel panel;
	
	/**
	 * Constructor.
	 * @param panel  ConverterPanel to be operated on.
	 */
	public FeetConversionObserver(ConverterPanel panel) {
		super();
		this.panel = panel;
	}
	
	/**
	 * This method converts and sets the value of the feetConversionArea.
	 * @param value  double value to be used.
	 */
	public void update(double value) {
		this.panel.setFootValue(value / 30.48);
	}
}
