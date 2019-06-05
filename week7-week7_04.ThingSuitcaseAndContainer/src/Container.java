import java.util.ArrayList;

public class Container {
    private int maxWeight;
    private int actualWeight;
    private ArrayList<Suitcase> suitcases;

    public Container(int max){
        this.maxWeight=max;
        this.actualWeight=0;
        suitcases=new ArrayList<Suitcase>();
    }
    public void addSuitcase(Suitcase suitcase){
        if((this.actualWeight+suitcase.getActualWeight())>this.maxWeight){
            return;
        }
        suitcases.add(suitcase);
        this.actualWeight+=suitcase.getActualWeight();
    }
    public void printThings(){
        for(Suitcase suitcase:suitcases){
            suitcase.printThings();
        }
    }
    @Override
    public String toString() {
        switch (this.suitcases.size()) {
            case 0:
                return "empty (0 kg)";
            case 1:
                return suitcases.size() + " suitcase (" + this.actualWeight + " kg)";
            default:
                return suitcases.size() + " suitcases (" + this.actualWeight + " kg)";
        }
    }
}
