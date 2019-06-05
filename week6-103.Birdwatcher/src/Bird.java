
public class Bird {
    private String name;
    private String LatinName;
    private int observed=0;

    public Bird(String name,String LatinName){
        this.name=name;
        this.LatinName= LatinName;
    }
    public void gotObserved(){
        this.observed++;
    }
    public int getObserved(){
        return this.observed;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return this.name+" ("+this.LatinName+")";
    }
}
