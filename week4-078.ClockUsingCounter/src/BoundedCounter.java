public class BoundedCounter {

    private int value=0,upperLimit;

    public BoundedCounter(int upperLimit){
        this.upperLimit=upperLimit;
    }
    public void next(){
        if((this.value+1)>this.upperLimit){
            this.value=0;
        }else{
            this.value++;
        }
    }
    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        if(value>=0&&value<=this.upperLimit){
            this.value=value;
        }
    }
    @Override
    public String toString(){
        if(value<10){
            return "0"+this.value;
        }else{
        return Integer.toString(this.value);
        }
    }

}
