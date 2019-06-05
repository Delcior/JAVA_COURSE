
import sun.java2d.pipe.SpanIterator;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guess,noGuess=0;
        while(true){
            System.out.println("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());
            if(guess>numberDrawn){
                System.out.println("The number is lesser,guesses made: "+(++noGuess));
            }else if(guess<numberDrawn){
                System.out.println("The number is greater,guesses made: "+(++noGuess));
            }else{
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
