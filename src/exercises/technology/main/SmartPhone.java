package exercises.technology.main;

public class SmartPhone extends Computer{
    //variable/property
    private boolean isConnectedTo5G;

    //constructor
    public SmartPhone (int screenWidth, int screenHeight, String manufactureYear, Boolean isConnectedTo5G) {
        super(screenWidth, screenHeight, manufactureYear);
        this.isConnectedTo5G = isConnectedTo5G;
    }

    //method
    public boolean getIsConnectedTo5G() { return this.isConnectedTo5G; }
    public void makePhoneCall(String phoneNumber) {
        System.out.println("Calling: " + phoneNumber);
    }
}
