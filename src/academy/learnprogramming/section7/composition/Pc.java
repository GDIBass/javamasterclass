package academy.learnprogramming.section7.composition;

public class Pc {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard motherboard;

    public Pc(Case theCase, Monitor theMonitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy Graphics
        theMonitor.drawPixelAt(1200, 50, "yellow");
    }

//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getTheMonitor() {
//        return theMonitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
