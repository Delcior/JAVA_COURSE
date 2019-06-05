
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        String word;
        while(true){
            System.out.print("Type the password: ");
            word =reader.nextLine();
            if(word.equals(password)){
                System.out.println("Right!\n");
                System.out.println("The secret is: jryy qbar!");
                break;
            }else{
                System.out.println("Wrong!");
            }
        }
    }
}
