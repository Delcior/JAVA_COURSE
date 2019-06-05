public class Counter {
    private int value;
    boolean check;

    public Counter(int startingValue, boolean check){
        if(check==true)
        {
            if(startingValue>=0){
                this.value=startingValue;
                this.check=true;
            }
        }else{
            this.value=startingValue;
            this.check=false;
        }

    }
    public Counter(int startingValue){
        this.value=startingValue;
        this.check=false;
    }
    public Counter(boolean check){
        this(0,check);
    }
    public Counter(){
        this.value=0;
        this.check=false;
    }
    public int value(){
        return this.value;
    }
    public void increase(){
        this.value++;
    }
    public void increase(int num){
        if(num>=0)
        this.value+=num;
    }
    public void decrease(){
        if(this.check==true){
            if((this.value-1)<0){
                return;
            }else {
                this.value--;
            }
        }else{
            this.value--;
        }
    }
    public void decrease(int num){
        if(num>=0){
            if(this.check==true){
                if((this.value-num)<0){
                    this.value=0;
                }else {
                    this.value-=num;
                }
            }else{
                this.value-=num;
            }
        }
    }

}
