
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum=0,val;
        System.out.println("Until what? ");
        val=Integer.parseInt(reader.nextLine());
        for(int i=0;i<=val;i++)
            sum+=i;
        System.out.println("Sum is"+ sum);
    }
}
