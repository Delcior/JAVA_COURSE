import java.util.ArrayList;

public class Changer {

    private ArrayList<Change> tabOfChanges;
    public Changer(){
        this.tabOfChanges=new ArrayList<Change>();
    }
    public void addChange(Change change){
        this.tabOfChanges.add(change);
    }
    public String change(String characterString){
        for(Change change:tabOfChanges){
            characterString=change.change(characterString);
        }
        return characterString;
    }
}
