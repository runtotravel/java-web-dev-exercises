package exercises.technology.main;

public class Program {
    public static void main(String[] args) {
        SmartPhone mySmartPhone = new SmartPhone(5000, 3000, "2021", true );
        System.out.println(mySmartPhone.getId());

         Laptop myLaptop = new Laptop (5000, 3000, "2021", true);
        System.out.println(myLaptop.getId());

        Computer myComputer = new Computer(5000,3000, "2021");
        System.out.println(myComputer.getId());
    }
}
