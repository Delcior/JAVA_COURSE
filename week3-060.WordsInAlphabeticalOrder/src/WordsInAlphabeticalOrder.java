
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words= new ArrayList<String>();
        String word;
        while(true) {
            System.out.print("Type a word: ");
            if ((word=reader.nextLine()).isEmpty()) {
                System.out.println("You typed the following words:");
                Collections.sort(words);
                for(String slowo : words){
                    System.out.println(slowo);
                }
                break;
            } else {
                words.add(word);
            }
        }
    }
}
