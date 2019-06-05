
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int num1=Integer.parseInt(reader.nextLine());
        int sum=0;
        for (int i = 0; i <=num1; i++) {
            sum+=(int)Math.pow(2,i);
        }
        System.out.println("The result is"+sum);
    }
}
