package hw05;
/* Angel Serrano
 * CS 2012
 * Section 05
 * Description: This class is meant to create the Motherboard using the inheritance from
 * the parent class PCPart
 */
public class PCBuilder {
   private PCCase tower;
   private Motherboard motherBoard;
   private Processor processor;
   private VideoCard videoCard;
   private HardDrive hardDrive;
   private Memory memory;
   private Monitor monitor;

   //Constructor to build PC
   public PCBuilder() {
       super();
   }
   //getters and adders(don't know if thats an actual term
   public PCCase getTower() {
       return tower;
   }

   public void addTower(PCCase tower) {
       this.tower = tower;
   }

   public Motherboard getMotherBoard() {
       return motherBoard;
   }

   public void addMotherBoard(Motherboard motherBoard) {
       this.motherBoard = motherBoard;
   }

   public Processor getProcessor() {
       return processor;
   }

   public void addProcessor(Processor processor) {
       this.processor = processor;
   }

   public VideoCard getVideoCard() {
       return videoCard;
   }

   public void addVideoCard(VideoCard videoCard) {
       this.videoCard = videoCard;
   }

   public HardDrive getHardDrive() {
       return hardDrive;
   }

   public void addHardDrive(HardDrive hardDrive) {
       this.hardDrive = hardDrive;
   }

   public Memory getMemory() {
       return memory;
   }

   public void addMemory(Memory memory) {
       this.memory = memory;
   }

   public Monitor getMonitor() {
       return monitor;
   }

   public void addMonitor(Monitor monitor) {
       this.monitor = monitor;
   }
   //Calculates total cost of PC
   public double computeTotalCost() {
       return (this.tower != null ? this.tower.getPrice() : 0)
               + (this.motherBoard != null ? this.motherBoard.getPrice() : 0)
               + (this.processor != null ? this.processor.getPrice() : 0)
               + (this.videoCard != null ? this.videoCard.getPrice() : 0)
               + (this.hardDrive != null ? this.hardDrive.getPrice() : 0)
               + (this.memory != null ? this.memory.getPrice() : 0)
               + (this.monitor != null ? this.monitor.getPrice() : 0);
   }
   //ToString
   @Override
   public String toString() {
       return "tower:" + tower + ", motherBoard:" + motherBoard + ", processor:" + processor + ", videoCard:"
               + videoCard + ", hardDrive:" + hardDrive + ", memory:" + memory + ", monitor:" + monitor + "\n";
   }

}

