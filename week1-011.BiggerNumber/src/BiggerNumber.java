
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.print("type another number: ");
        int b = Integer.parseInt(reader.nextLine());
        System.out.println("The bigger number of two numbers given was:"+Math.max(a,b));

        // Implement your program here. Remember to ask the input from user
    }
}
