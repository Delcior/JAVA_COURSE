package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover{
    private Set<String> set;
    private int nOfDups;

    public PersonalDuplicateRemover(){
        this.set=new HashSet<String>();
        this.nOfDups=0;
    }
    public void add(String characterString){
        if(!set.add(characterString))
            nOfDups++;
    }
    public int getNumberOfDetectedDuplicates(){return this.nOfDups;}
    public Set<String> getUniqueCharacterStrings(){return this.set;}
    public void empty(){
        this.nOfDups=0;
        this.set.removeAll(set);
    }
}
