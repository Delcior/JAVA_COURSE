
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        System.out.println("Circumference of the circle: " +(radius*Math.PI*2));

        // Program your solution here
    }
}
