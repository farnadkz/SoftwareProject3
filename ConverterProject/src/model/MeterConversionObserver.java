package model;

import view.ConverterPanel;

/**
 * This class updates the meterConversionArea and acts as a "ConcreteObserver" in Observer pattern.
 */
public class MeterConversionObserver implements Observer{
	protected ConverterPanel panel;
	
	/**
	 * Constructor.
	 * @param panel  ConverterPanel to be operated on.
	 */
	public MeterConversionObserver(ConverterPanel panel) {
		super();
		this.panel = panel;
	}
	
	/**
	 * This method converts and sets the value of the meterConversionArea.
	 * @param value  double value to be used.
	 */
	public void update(double value) {
		this.panel.setMeterValue(value / 100.0);
	}
}
