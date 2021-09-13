package hw05;

public class PCCase extends PCPart {
	//Data fields pretaining to PCCase
	private String type;
	private String color;
	//Constructor for PC Case	
	public PCCase(String name, String brand, String partNumber, double price, String type, String color) {
		super(name, brand, partNumber, price);
		this.type = type;
		this.color = color;
	}
	//Getters
	public String getType() {
		return type;
	}
	
	public String getColor() {
		return color;
	}
	//ToString
	@Override
	public String toString() {
		return "Name:" + getName() + "\nBrand:" + getBrand() + "\nPart #:" + getPartNumber() + "\nType:" + type
				+ "\nColor:" + color + "\nPrice:" + getPrice() + "\n";
	}
}

