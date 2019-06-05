package moving.logic;
import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {

    private int boxesVolume;

    public Packer(int boxesVolume){
        this.boxesVolume=boxesVolume;
    }
    public List<Box> packThings(List<Thing> things){
        List<Box> listOfBoxes=new ArrayList<Box>();
        int counter=0,i=0;

        while(true) {
            listOfBoxes.add(new Box(this.boxesVolume));
            while (listOfBoxes.get(counter).addThing(things.get(i))) {
                if(i==things.size()-1)
                    return listOfBoxes;
                i++;
            }
            counter++;
        }
    }
}
