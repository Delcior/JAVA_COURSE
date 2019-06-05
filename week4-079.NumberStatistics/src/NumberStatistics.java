
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers=0;
        this.sum=0;
    }

    public void addNumber(int number) {
        this.amountOfNumbers++;
        this.sum+=number;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }
    public int sum(){
        return this.sum;
    }
    public double average(){
        if(amountOfNumbers==0){
            return 0.0;
        }else{
        return sum/(double)amountOfNumbers;
        }
    }
    @Override
    public String toString(){
        return Integer.toString(sum);
    }
}
