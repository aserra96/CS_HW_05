package hw05;
/* Angel Serrano
 * CS 2012
 * Section 05
 * Description: This class is meant to create the Monitor for the PC parts using the inheritance from
 * PCPart Parent Class 
 */
public class Monitor extends PCPart {
	//Data fields Pertaining to Monitor
	private String screenSize;
	private String resolution;
   
	//Constructor for Monitors
	public Monitor(String name, String brand, String partNumber, double price, String screenSize, String resolution) {
		super(name, brand, partNumber, price);
		this.screenSize = screenSize;
		this.resolution = resolution;
	}
   
	//getters
	public String getScreenSize() {
		return screenSize;
	}

	public String getResolution() {
		return resolution;
	}
   
	@Override
	public String toString() {
		return "Name:" + getName() + "\nBrand:" + getBrand() + "\nPart #:" + getPartNumber() + "\nScreen Size:"
				+ screenSize + "\nResolution:" + resolution + "\nPrice:" + getPrice() + "\n";
	}
}
