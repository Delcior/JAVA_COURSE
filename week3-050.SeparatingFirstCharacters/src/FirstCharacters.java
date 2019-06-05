import java.util.Scanner;

public class FirstCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type you name: ");
        String name=reader.nextLine();
        firstCharacters(name);

    }
    public static void firstCharacters(String text){
        if(text.length()>=3) {
            for (int i = 0; i < 3; i++) {
                System.out.println((i + 1) + ". character: " + text.charAt(i));
            }
        }else{
            return;
        }
    }
}
