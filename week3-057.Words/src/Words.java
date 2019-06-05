import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word;
        ArrayList<String> words= new ArrayList<String>();

        while(!(word=reader.nextLine()).isEmpty()){
            words.add(word);
        }
        System.out.println("You typed the following words:");
        for(String slowo :words){
            System.out.println(slowo);
        }
    }
}
