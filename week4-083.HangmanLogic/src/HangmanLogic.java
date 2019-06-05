
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        if(!(this.guessedLetters.contains(letter))){
            this.guessedLetters+=letter;

            if(!this.word.contains(letter)){
                this.numberOfFaults++;
            }
        }else{
            return;
        }
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        String result="";
        boolean setValue = false;
        while(true){
            for(int i=0;i<this.word.length();i++){
                for(int k=0;k<this.guessedLetters.length();k++){
                    if(this.word.charAt(i)==this.guessedLetters.charAt(k)){
                        result+=guessedLetters.charAt(k);
                        setValue = true;
                    }
                }
                if(!setValue){
                    result+="_";
                }
                setValue=false;
            }
            return result;
        }
        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        // return the hidden word at the end

    }
}
