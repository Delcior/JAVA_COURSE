import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type na number: ");
        int num1=Integer.parseInt(reader.nextLine());
        int sum=1;
        for (int i = 1; i <=num1; i++) {
            sum*=i;
        }
        System.out.println("Factorial is "+sum);
    }
}
