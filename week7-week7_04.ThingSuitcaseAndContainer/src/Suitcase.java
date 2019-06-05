import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private int actualWeight;
    private ArrayList<Thing> things;

    public Suitcase(int max){
        this.maxWeight=max;
        this.actualWeight=0;
        this.things=new ArrayList<Thing>();
    }
    public void addThing(Thing thing){
        if((this.actualWeight+thing.getWeight())>this.maxWeight){
            return;
        }
        things.add(thing);
        this.actualWeight+=thing.getWeight();
    }
    public void printThings(){
        for(Thing thing:things){
            System.out.println(thing);
        }
    }
    public int getActualWeight(){
        return this.actualWeight;
    }
    public int totalWeight(){
        return this.actualWeight;
    }
    public Thing heaviestThing(){
        if(this.things.size()==0)
            return null;
        Thing heaviest=this.things.get(0);
        for(int i=1;i<this.things.size();i++){
            if(this.things.get(i).getWeight()>heaviest.getWeight())
                heaviest=this.things.get(i);
        }
        return heaviest;
    }
    @Override
    public String toString(){
        switch (this.things.size()) {
            case 0:
                return "empty (0 kg)";
            case 1:
                return things.size() + " thing (" + this.actualWeight + " kg)";
            default:
                return things.size() + " things (" + this.actualWeight + " kg)";
        }
    }
}
