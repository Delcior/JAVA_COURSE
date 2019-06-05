public class DecreasingCounter {
    private int value;
    private int initialValue;// instance variable that remembers the value of the counter

    public DecreasingCounter(int valueAtStart) {
        this.value = this.initialValue=valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if(value>0)
        this.value--;
    }
    public void reset(){
        this.value=0;
    }
    public void setInitial(){
        this.value=this.initialValue;
    }
    // and here the rest of the methods
}
