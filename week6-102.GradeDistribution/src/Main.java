import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Grades exam1= new Grades();
        int score;
        while((score=scanner.nextInt())!=-1){
            exam1.giveScore(score);
        }
        exam1.results();
        System.out.println("Acceptance percentage: "+exam1.accepted());

    }
}
