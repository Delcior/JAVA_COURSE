import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String,Double> note ;

    public PromissoryNote(){
        note=new HashMap<String, Double>();
    }
    public void setLoan(String toWhom,double value){
        this.note.put(toWhom,value);
    }
    public double howMuchIsTheDebt(String whose){
        if((this.note.get(whose))==null){
            return 0;
        }
        return this.note.get(whose);
    }
}
