
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable


        for(int i=0;i<3;i++){
            read=Integer.parseInt(reader.nextLine());
            sum+=read;
        }
        // Use2 only variables sum and read

        System.out.println("Sum: " + sum);
    }
}
