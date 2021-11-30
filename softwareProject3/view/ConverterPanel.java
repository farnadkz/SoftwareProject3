package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * This class creates the panel that the visuals are displayed on.
 */
public class ConverterPanel extends JPanel{
	private JTextArea centimetersConversionArea = new JTextArea("0");
	private JTextArea feetConversionArea = new JTextArea("0 ft");
	private JTextArea meterConversionArea = new JTextArea("0 m");
	
	/**
	 * Constructor creates panel and JTextAreas for values.
	 */
	public ConverterPanel() {
		super();
		super.setLayout(null);
		centimetersConversionArea.setBounds(200, 204, 200, 20);
		centimetersConversionArea.setBackground(Color.yellow);
		feetConversionArea.setBounds(100, 2, 200, 20);
		feetConversionArea.setBackground(Color.green);
		meterConversionArea.setBounds(302, 2, 200, 20);
		meterConversionArea.setBackground(Color.orange);
		super.add(centimetersConversionArea);
		super.add(feetConversionArea);
		super.add(meterConversionArea);
	}
	
	/**
	 * This method paints the colored squares on the panel.
	 * @param g  the Graphics to be painted on.
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.green);
		g.fillRect(100, 2, 200, 200);
		g.setColor(Color.orange);
		g.fillRect(302, 2, 200, 200);
		g.setColor(Color.yellow);
		g.fillRect(200, 204, 200, 200);
	}
	
	/**
	 * Used to get the centimeter value from client.
	 * @return double value that client inputed.
	 */
	public double getValue() {
		return Double.parseDouble(this.centimetersConversionArea.getText());
	}
	
	/**
	 * This method sets the value of the meterConversionArea.
	 * @param m  the double value that meterConversionArea will take.
	 */
	public void setMeterValue(double m) {
		meterConversionArea.setText(String.valueOf(m) + " m");
	}
	
	/**
	 * This method sets the value of the feetConversionArea.
	 * @param ft  the double value that feetConversionArea will take.
	 */
	public void setFootValue(double ft) {
		feetConversionArea.setText(String.valueOf((new BigDecimal(ft).setScale(11, RoundingMode.HALF_DOWN)).doubleValue()) + " ft");
	}
}
