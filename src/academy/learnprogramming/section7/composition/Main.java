package academy.learnprogramming.section7.composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27 inch mon", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        Pc pc = new Pc(theCase, theMonitor, motherboard);

        pc.powerUp();
//        pc.getTheCase().pressPowerButton();
//        pc.getTheMonitor().drawPixelAt(1, 2, "blue");
//        pc.getMotherboard().loadProgram("Asheron's Call");
    }
}
