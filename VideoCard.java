package hw05;
/* Angel Serrano
 * CS 2012
 * Section 05
 * Description: This class is meant to create the GPU(;-;) using the inheritance from
 * the parent class PCPart(when will they exist in real life ;-;)
 */
public class VideoCard extends PCPart {
	//Data fields for GPU a ;-;
	private String memory;
	private String coreClock;
	//Constructor for GPU a ;-;
	public VideoCard(String name, String brand, String partNumber, double price, String memory, String coreClock) {
		super(name, brand, partNumber, price);
		this.memory = memory;
		this.coreClock = coreClock;
	}
	//getters
	public String getMemory() {
		return memory;
	}

	public String getCoreClock() {
		return coreClock;
	}
	//toString
	@Override
	public String toString() {
		return "Name:" + getName() + ", \nBrand:" + getBrand() + ", \nPart #:" + getPartNumber() + "\nMemory:" + memory
				+ ", \nCore Clock:" + coreClock + ", \nPrice:" + getPrice() + "\n";
	}
}
