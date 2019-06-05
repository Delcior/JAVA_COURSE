
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you: ");
        int number = Integer.parseInt(reader.nextLine());

        if(number>=0&&number<=120){
            System.out.println("OK");
        }else{
            System.out.println("Impossible");
        }
    }
}
