package moving.domain;
import java.util.*;

public class Box implements Thing{

    private int maximumCapacity;
    private List<Thing> listOfThings;

    public Box(int maximumCapacity){
        this.maximumCapacity=maximumCapacity;
        this.listOfThings=new ArrayList<Thing>();
    }
    public boolean addThing(Thing thing){
        if(thing.getVolume()+this.getVolume()>this.maximumCapacity)
            return false;
        listOfThings.add(thing);
        return true;
    }
    @Override
    public int getVolume() {
        int i=0;
        for(Thing thing:listOfThings){
            i+=thing.getVolume();
        }
        return i;
    }
}
