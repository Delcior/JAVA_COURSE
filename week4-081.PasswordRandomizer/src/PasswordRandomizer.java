import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random randomizer;

    public PasswordRandomizer(int length) {
        this.length=length;
        this.randomizer = new Random();
    }

    public String createPassword() {
        String password="";

        for(int i=0;i<length;i++){
            password+="abcdefghijklmnoprstuwyxyz".charAt(randomizer.nextInt(25));
        }
        return password;
    }
}
