import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int number2 = Integer.parseInt(reader.nextLine());

        if(number>number2){
            System.out.println("Greater number: "+number);
        }else if(number2>number){
            System.out.println("Greater number: "+ number2);
        }else{
            System.out.println("The number are equal!");
        }
    }
}
