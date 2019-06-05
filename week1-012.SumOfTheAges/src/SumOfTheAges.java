
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("type your name: ");
        String name = reader.nextLine();
        System.out.print("type your age: ");
        int age = Integer.parseInt(reader.nextLine());
        System.out.print("type your name: ");
        String name2 = reader.nextLine();
        System.out.print("type your age: ");
        int age2 = Integer.parseInt(reader.nextLine());
        System.out.printf(name+" and " + name2+" are "+(age+age2)+" years old in total");
        // Implement your program here
    }
}
