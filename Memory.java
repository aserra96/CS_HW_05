package hw05;
/* Angel Serrano
 * CS 2012
 * Section 05
 * Description: This class is meant to create the Memory for the PC parts using the inheritance from
 * PCPart Parent Class 
 */
public class Memory extends PCPart {
	//Data Fields pertaining to Memory
	private String formFactor;
	private String modules;

	//Constructor for the RAM
	public Memory(String name, String brand, String partNumber, double price, String formFactor, String modules) {
		super(name, brand, partNumber, price);
		this.formFactor = formFactor;
		this.modules = modules;
	}

	//Getters
	public String getFormFactor() {
		return formFactor;
	}

	public String getModules() {
		return modules;
	}

	@Override
	public String toString() {
		return "Name:" + getName() + "\nBrand:" + getBrand() + "\nPart #:" + getPartNumber() + "\nForm Factor:"
				+ formFactor + "\nModules:" + modules + "\nPrice:" + getPrice() + "\n";
	}
}
