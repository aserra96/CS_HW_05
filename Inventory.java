package hw05;
/* Angel Serrano
 * CS 2012
 * Section 05
 * Description: This class is meant to create the Inventory for all PC parts available 
 */
import java.util.ArrayList;
import java.util.List;

public class Inventory {
	//Array List Data fields for each component holding 3 parts each
	private List<PCCase> tower;
	private List<Motherboard> motherBoard;
	private List<Processor> processor;
	private List<VideoCard> videoCard;
	private List<HardDrive> hardDrive;
	private List<Memory> memory;
	private List<Monitor> monitor;

	//Constructor for inventory
	public Inventory() {
		super();
		this.tower = new ArrayList<>();
		this.motherBoard = new ArrayList<>();
		this.processor = new ArrayList<>();
		this.videoCard = new ArrayList<>();
		this.hardDrive = new ArrayList<>();
		this.memory = new ArrayList<>();
		this.monitor = new ArrayList<>();
	}	
	//Creates and adds each component to the data to the constructor
	public void initializeInventory() {
		PCCase case1 = new PCCase("Cooler Master Masterbox", "Cooler Master", "MCB-Q300L-KANN-S00", 44.99, "MicroATX Mini Tower", "Black");
		PCCase case2 = new PCCase("In Win D-Frame 2.0", "In Win", "D-Frame 2.0 BK/GO", 1199.00, "ATX Full Tower", "Black / Gold");
		PCCase case3 = new PCCase("Corsair iCUE 4000X RGB", "Corsair", "CC-9011205-WW", 130.99, "TX Mid Tower", "White");
		this.tower.add(case1);
		this.tower.add(case2);
		this.tower.add(case3);

		Motherboard motherBoard1 = new Motherboard("Asus TUF GAMING X570-PLUS", "Asus", "90MB1170-MVAAY0", 188.99, "AM4", "ATX");
		Motherboard motherBoard2 = new Motherboard("Z390 AORUS PRO", "Gigabyte", "GA-Z390-AORUS-PRO-WIFI", 189.99, "LGA1151", "ATX");
		Motherboard motherBoard3 = new Motherboard("MSI B450M PRO-M2 MAX", "MSI", "7B84-017R", 78.98, "AM4", "Micro ATX ");
		this.motherBoard.add(motherBoard1);
		this.motherBoard.add(motherBoard2);
		this.motherBoard.add(motherBoard3);

		Processor processor1 = new Processor("Intel Core i9-9900K", "Intel", "BX80684I99900K", 399.99, "3.6 GHz", 8);
		Processor processor2 = new Processor("AMD Ryzen 9 3950X", "AMD", "100-100000051WOF", 719.99, "3.5 GHz", 16);
		Processor processor3 = new Processor("Intel Core i7-5960X", "Intel", "BX80648I75960X", 799.99, "3 GHz", 8);
		this.processor.add(processor1);
		this.processor.add(processor2);
		this.processor.add(processor3);

		VideoCard videoCard1 = new VideoCard("GeForce RTX 3090", "NVIDIA", "900-1G136-2510-000", 1499.99, "24 GB", "1395 MHz");
		VideoCard videoCard2 = new VideoCard("Titan V", "NVIDIA", "900-1G500-2500-000", 2756.99, "12 GB", "1200 MHz");
		VideoCard videoCard3 = new VideoCard("Radeon RX 5700 XT", "Radeon", "RX 5700 XT 8G", 449.99, "8 GB", "1605 MHz ");
		this.videoCard.add(videoCard1);
		this.videoCard.add(videoCard2);
		this.videoCard.add(videoCard3);

		HardDrive hradDrive1 = new HardDrive("Samsung 970 Evo 1 TB", "Samsung", "MZ-V7E1T0BW", 168.28, "SSD", "1 TB");
		HardDrive hradDrive2 = new HardDrive("Seagate BarraCuda", "Seagate", "ST1000DM010", 49.99, "7200RPM", "1 TB");
		HardDrive hradDrive3 = new HardDrive("Western Digital Blue 2 TB", "Western Digital", "WD6002VRYZ/WD6002FRYZ", 0, "49.99", "2 TB");
		this.hardDrive.add(hradDrive1);
		this.hardDrive.add(hradDrive2);
		this.hardDrive.add(hradDrive3);

		Memory memory1 = new Memory("Corsair Vengeance RGB", "Corsair", "CMW32GX4M2C3200C16", 131.99, "288-pin DIMM", "2 x 16GB");
       	Memory memory2 = new Memory("Crucial Ballistix 16 GB", "Crucial", "BL2K8G32C16U4B", 59.99, "288-pin DIMM", "2 x 8GB");
       	Memory memory3 = new Memory("Samsung 8 GB", "Samsung", "MV-3V4G3D/US", 306.36, "240-pin DIMM", "2 x 4GB");
       	this.memory.add(memory1);
       	this.memory.add(memory2);
       	this.memory.add(memory3);

       	Monitor monitor1 = new Monitor("Samsung U28E590D", "Samsung", "U28E590D", 357.68, "28\"", "3840 x 2160");
       	Monitor monitor2 = new Monitor("Razer RAPTOR 27", "Razer", "RZ39-02760100-R3U1", 699.99, "27\"", "2560 x 1440");
       	Monitor monitor3 = new Monitor("Samsung C49RG9", "Samsung", "LC49RG90SSNXZA", 1199.99, "49\"", "5120 x 1440");
       	this.monitor.add(monitor1);
       	this.monitor.add(monitor2);
       	this.monitor.add(monitor3);

	}

	//Getters
	public PCCase getTower(int index) {
		return tower.get(index);
	}

	public Motherboard getMotherBoard(int index) {
  	    return motherBoard.get(index);
	}

	public Processor getProcessor(int index) {
  	    return processor.get(index);
	}
   
	public VideoCard getVideoCard(int index) {
		return videoCard.get(index);
	}

	public HardDrive getHardDrive(int index) {
		return hardDrive.get(index);
	}

	public Memory getMemory(int index) {
		return memory.get(index);
	}

	public Monitor getMonitor(int index) {
		return monitor.get(index);
	}

	public void printTowers() {
		int i = 0;
       	for (PCCase cases : tower) {
       		System.out.println(i++ + ". " + cases.toString() + "\n");
       	}
	}

	//Prints parts
	public void printMotherBoards() {
		int i = 0;
		for (Motherboard board : motherBoard) {
			System.out.println(i++ + ". " + board.toString() + "\n");
		}
	}

	public void printProcessors() {
		int i = 0;
		for (Processor cpu : processor) {
			System.out.println(i++ + ". " + cpu.toString() + "\n");
		}
	}

	public void printVideoCards() {
		int i = 0;
		for (VideoCard card : videoCard) {
			System.out.println(i++ + ". " + card.toString() + "\n");
		}
	}

	public void printHardDrives() {
		int i = 0;
		for (HardDrive drive : hardDrive) {
			System.out.println(i++ + ". " + drive.toString() + "\n");
		}
	}

	public void printMemorys() {
       int i = 0;
       for (Memory me : memory) {
           System.out.println(i++ + ". " + me.toString() + "\n");
       }
   }

   public void printMonitors() {
       int i = 0;
       for (Monitor mon : monitor) {
           System.out.println(i++ + ". " + mon.toString() + "\n");
       }
   }
}
