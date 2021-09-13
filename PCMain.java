package hw05;
/* Angel Serrano
 * CS 2012
 * Section 05
 * Description: This class is the main class that creates the inventory and starts the building process
 * where you will choose what part you want to add to you imaginary PC (cause sourcing parts right now is that hard
 * ;_;)
 */
import java.util.Scanner;

public class PCMain {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int userChoice = 0;
		//Initializes inventory 
		Inventory inventory = new Inventory();
		inventory.initializeInventory();
		//Calls PC constructor to start building
		PCBuilder pc = new PCBuilder();
		//Loop statment for main menu
		do {
			userChoice = chooseMainMenuItem();
			
			//Switch system for choosing
			switch (userChoice) {
			case 1: {
				System.out.println("Choose from the Case's below: \n");
				inventory.printTowers();
				int index = sc.nextInt();
				pc.addTower(inventory.getTower(index));
			} break;
			
			case 2: {
				System.out.println("Choose from the Motherboard's below: \n");
				inventory.printMotherBoards();
				int index = sc.nextInt();
				pc.addMotherBoard(inventory.getMotherBoard(index));
			} break;
			
			case 3: {
				System.out.println("Choose from the Monitor's below: \n");
				inventory.printMonitors();
				int index = sc.nextInt();
				pc.addMonitor(inventory.getMonitor(index));			
	        } break;	
	        
	        case 4: {
	        	System.out.println("Choose from the CPU's below: \n");
	        	inventory.printProcessors();
	        	int index = sc.nextInt();
	        	pc.addProcessor(inventory.getProcessor(index));
	        } break;
	        
	        case 5: {
	        	System.out.println("Choose from the Videocard's below: \n");
	        	inventory.printVideoCards();
	        	int index = sc.nextInt();
	        	pc.addVideoCard(inventory.getVideoCard(index));

	        } break;  
	        
	        case 6: {
	        	System.out.println("Choose from the Hard drive's below: \n");
	        	inventory.printHardDrives();
	        	int index = sc.nextInt();
	        	pc.addHardDrive(inventory.getHardDrive(index));
	        } break;
	        
	        case 7: {
	        	System.out.println("Choose from the Memory's below: \n");
	        	inventory.printMemorys();
	        	int index = sc.nextInt();
	        	pc.addMemory(inventory.getMemory(index));
	        } break;	
	        
	        case 8: {
	        	System.out.println("Your PC parts are: " + pc.toString());
	        	System.out.println("Your total amount is: " + pc.computeTotalCost());
	        } break;
	        
	        case 9: {
	        } break;
	        
	        default: {
	        	System.out.println("Please enter a valid choice.");
	        }  break;
			}
		} 
		while (userChoice != 9);
	   	}
					
	private static int chooseMainMenuItem() {
		System.out.println("***************Main Menu***************");
		System.out.println("1. Choose a case");
		System.out.println("2. Choose a MotherBoard");
		System.out.println("3. Choose a Monitor");
		System.out.println("4. Choose a CPU");
		System.out.println("5. Choose a VideoCard");
		System.out.println("6. Choose a Hard Drive");
		System.out.println("7. Choose a Memory");
		System.out.println("8. Display Reciept");
		System.out.println("9. Exit program");
		System.out.println("****************************************");
		return sc.nextInt();
	}

}
