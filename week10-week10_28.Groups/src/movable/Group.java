package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable{
    private List<Movable> group;

    public Group(){
        group=new ArrayList<Movable>();
    }
    public void addToGroup(Movable movable){
        group.add(movable);
    }
    @Override
    public void move(int dx,int dy){
        for(Movable organism:group){
            organism.move(dx,dy);
        }
    }
    @Override
    public String toString(){
        StringBuilder sB=new StringBuilder();
        for(int i=0;i<group.size();i++){
            sB.append(group.get(i).toString());
            sB.append("\n");
        }
        return sB.toString();
    }
}
