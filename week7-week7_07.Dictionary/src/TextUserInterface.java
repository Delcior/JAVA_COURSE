//import java.util.Scanner;
//
//public class TextUserInterface {
//    private Scanner reader;
//    private Dictionary dictionary;
//
//    public TextUserInterface(Scanner reader,Dictionary dic){
//        this.reader=reader;
//        this.dictionary=dic;
//    }
//    public void start(){
//        options();
//        boolean game =true;
//        while (game){
//            System.out.print("\nStatement: ");
//            switch (getStatement()){
//                case "add":
//                    add();
//                    break;
//                case "translate":
//                    translate();
//                    break;
//                case "quit":
//                    System.out.println("Cheers!");
//                    game=false;
//                    break;
//                default:
//                    System.out.println("Unknown statement");
//                    break;
//            }
//        }
//    }
//    public void options(){
//        System.out.println("Statements: \n" +
//                "  add - adds a word couple to the dictionary\n" +
//                "  translate - asks for a word and prints its translation\n" +
//                "  quit - stops the user interface");
//    }
//    public String getStatement(){
//        return reader.nextLine();
//    }
//    public void add(){
//        String finnish,english;
//        System.out.print("In Finnish: ");
//        finnish= reader.nextLine();
//        System.out.print("Translation: ");
//        english=reader.nextLine();
//                if(finnish.equals(english))
//                    return;
//        this.dictionary.add(finnish,english);
//    }
//    public void translate(){
//        System.out.print("Give a word: ");
//        String result=dictionary.translate(reader.nextLine());
//        if(result==null){
//            System.out.println("Unknown word!");
//            return;
//        }
//        System.out.println("Translation: "+result);
//    }
//}
import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statement:");
        System.out.println("  quit - quit the text user interface\n");

        while (true) {
            String input = reader.nextLine();
            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (input.equals("add")) {
                System.out.print("In Finnish: ");
                String word = reader.nextLine();
                System.out.print("Translation: ");
                String translation = reader.nextLine();

                add(word, translation);
            } else if (input.equals("translate")) {
                System.out.print("Give a word: ");
                String word = reader.nextLine();
                System.out.println("Translation: " + translate(word));
            } else {
                System.out.println("Unknown statement\n");
            }
        }
    }

    public void add(String word, String translation) {
        dictionary.add(word, translation);
    }

    public String translate(String word) {
        return dictionary.translate(word);
    }
}