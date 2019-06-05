
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int num2 = Integer.parseInt(reader.nextLine());
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        // write your code here

    }
}
