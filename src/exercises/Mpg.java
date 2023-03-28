package exercises;
import java.util.Scanner;

public class Mpg {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("How many miles have you driven?");
    Double milesDriven = input.nextDouble();

    System.out.println("How many gallons of gas have you used?");
    Double gasUsed = input.nextDouble();

    Double mpg = milesDriven / gasUsed;
    System.out.println("You are using " + mpg + "mpg");
}
}
