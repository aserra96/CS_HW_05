package hw05;
/* Angel Serrano
 * CS 2012
 * Section 05
 * Description: This class is meant to create the CPU using the inheritance from
 * the parent class PCPart
 */
public class Processor extends PCPart {
	//Data fields pretaining to Processor
	private String coreClock;
	private int coreCount;
	//Constructor for Processor
	public Processor(String name, String brand, String partNumber, double price, String coreClock, int coreCount) {
		super(name, brand, partNumber, price);
		this.coreClock = coreClock;
		this.coreCount = coreCount;
	}
	//Getters
	public String getCoreClock() {
		return coreClock;
	}

	public int getCoreCount() {
		return coreCount;
	}
	//to String
	@Override
	public String toString() {
		return "Name:" + getName() + ", \nBrand:" + getBrand() + ", \nPart #:" + getPartNumber() + "\nCore Clock:"
				+ coreClock + ", \nCore Count:" + coreCount + ", \nPrice:" + getPrice() + "\n";
	}
}
