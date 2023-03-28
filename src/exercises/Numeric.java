package exercises;
import java.util.Scanner;

public class Numeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle?");
        Double recLength = input.nextDouble();

        System.out.println("What is the width of the rectangle?");
        Double recWidth = input.nextDouble();

        Double area = recLength * recWidth;
        System.out.println("The area of the rectangle is " + area);
    }
}
