package hw05;
/* Angel Serrano
 * CS 2012
 * Section 05
 * Description: This class is meant to create the hard drive using the inheritance from 
 * PCPart
 */
public class HardDrive extends PCPart {
	//Data Fields pertaining Hard Drive
	private String type;
	private String capacity;

	public HardDrive(String name, String brand, String partNumber, double price, String type, String capacity) {
	super(name, brand, partNumber, price);
	this.type = type;
	this.capacity = capacity;
	}
	   
	//Getters
	public String getType() {
		return type;
	}

	public String getCapacity() {
		return capacity;
	}
	
	//To String Override
	@Override
	public String toString() {
		return "Name:" + getName() + "\nBrand:" + getBrand() + "\nPart #:" + getPartNumber() + "\nType:" + type
				+ "\nCapacity:" + capacity + "\nPrice:" + getPrice() + "\n";
	   }
	}
