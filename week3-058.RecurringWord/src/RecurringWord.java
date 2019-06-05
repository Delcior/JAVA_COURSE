
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words= new ArrayList<String>();
        String word;
        while(true) {
            System.out.print("Type a word: ");
            if (words.contains(word = reader.nextLine())) {
                System.out.println("You gave twice the word "+word);
                break;
            } else {
                words.add(word);
            }
        }
    }
}
