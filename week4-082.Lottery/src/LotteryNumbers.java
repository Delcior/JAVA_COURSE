import java.util.ArrayList;
import java.util.Random;


public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random randomizer;
    private int num;

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        this.randomizer=new Random();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        numbers.removeAll(numbers);
        for(int i=0;i<7;i++){
            while(true) {
                if (!containsNumber(num = randomizer.nextInt(39) + 1)) {
                    numbers.add(num);
                    break;
                }
            }
        }
    }

    public boolean containsNumber(int number) {
        if (numbers.contains(number)) {
            return true;
        } else {
            return false;
        }
    }
}
