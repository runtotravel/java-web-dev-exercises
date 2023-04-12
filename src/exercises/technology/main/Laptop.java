package exercises.technology.main;

public class Laptop extends Computer {
    //variable/property
    private boolean isIntelliJOpen;

    //constructor
    public Laptop (int screenWidth, int screenHeight, String manufactureYear, Boolean isIntelliJOpen) {
        super(screenWidth, screenHeight, manufactureYear);
        this.isIntelliJOpen = isIntelliJOpen;
    }
    //method
    public boolean getIsIntelliJOpen() {return this.isIntelliJOpen; }
    public void setsIsIntelliJOpen(boolean isIntelliJOpen) { this.isIntelliJOpen = isIntelliJOpen; }
    public void openIntelliJ() {
        this.isIntelliJOpen = true;
        System.out.println("IntelliJ is now open!");
    }

}
