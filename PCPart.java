package hw05;
/* Angel Serrano
 * CS 2012
 * Section 05
 * Description: This class is meant to be the parent class to the rest of the PC part classes
 * this holds the main data each part will use 
 */
public class PCPart {
	//Parent Class Data fields
	private String name;
	private String brand;
	private String partNumber;
	private double price;
	//Constructor for PC parent Class
	public PCPart(String name, String brand, String partNumber, double price) {
		super();
		this.name = name;
		this.brand = brand;
		this.partNumber = partNumber;
		this.price = price;
	}
	//getters for Parent Class
	public String getName() {
		return name;
	}	

	public String getBrand() {
		return brand;
	}

	public String getPartNumber() {
		return partNumber;
	}	

	public double getPrice() {
		return price;
	}
	//toString
	@Override
	public String toString() {
		return "Name:" + name + ",\n Brand:" + brand + ", \nPart #:" + partNumber + "\n";
	}
}
