package hw05;
/* Angel Serrano
 * CS 2012
 * Section 05
 * Description: This class is meant to create the Motherboard using the inheritance from
 * the parent class PCPart
 */
public class Motherboard extends PCPart {
	//data fields pertaining to Motherboard
	private String socket;
	private String formFactor;
	//constructor for Motherboard
	public Motherboard(String name, String brand, String partNumber, double price, String socket, String formFactor) {
	  	super(name, brand, partNumber, price);
	  	this.socket = socket;
	  	this.formFactor = formFactor;
	}
	//getters
	public String getSocket() {
		return socket;
	}

	public String getFormFactor() {
		return formFactor;
	}

	@Override
	public String toString() {
		return "Name:" + getName() + ", \nBrand:" + getBrand() + ", \nPart #:" + getPartNumber() + "\nSocket:" + socket
				+ ", \nForm Factor:" + formFactor + ", \nPrice:" + getPrice() + "/n";
	}
}
