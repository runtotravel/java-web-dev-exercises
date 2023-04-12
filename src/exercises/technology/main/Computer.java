package exercises.technology.main;

public class Computer extends AbstractEntity {
    //class variables/properties
    private int screenWidth;
    private int screenHeight;
    private String manufactureYear;

    //constructor
    public Computer(int screenWidth, int screenHeight, String manufactureYear) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.manufactureYear = manufactureYear;
    }

    //methods - one to add 2 plus 2 and another to tell a joke
    //getters - add at top of methods - this is so ComputerTest can access them
    public int getScreenWidth() {return this.screenWidth; }
    public int getScreenHeight() {return this.screenHeight; }
    public String getManufactureYear() {return this.manufactureYear; }

    public int processTwoPlusTwo() {
        return 2+2;
    }

    public void tellAJoke() {
        System.out.println("Que hace un pez? Nada!");
    }
}
