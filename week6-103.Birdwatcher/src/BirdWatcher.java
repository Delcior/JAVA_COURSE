
import java.util.*;

public class BirdWatcher {
    private ArrayList<Bird> tab;

    public BirdWatcher(){
        this.tab=new ArrayList<Bird>();
    }
    public void add(Scanner scanner){
        String name,LatinName;
        System.out.print("Name: ");
        name=scanner.nextLine();
        System.out.print("Latin Name: ");
        LatinName=scanner.nextLine();
        this.tab.add(new Bird(name,LatinName));
    }
    public void observation(Scanner scanner){
        Bird ptok=null;
        System.out.print("What was observed:? ");
        String name=scanner.nextLine();
        for(Bird bird:tab){
            if(bird.getName().equals(name)){
                ptok=bird;
            }
        }
        if(ptok==null){
            System.out.println("Is not a bird!");
            return;
        }else{
            ptok.gotObserved();
        }
    }
    public void statistics(){
        for(int i=tab.size()-1;i>=0;i--){
            System.out.println(tab.get(i)+": "+tab.get(i).getObserved()+" observations");
        }
    }
    public void show(Scanner scanner){
        System.out.print("What? ");
        String name=scanner.nextLine();
        for(Bird bird:tab){
            if(bird.getName().equals(name)){
                System.out.println(bird+": "+bird.getObserved()+" observations");
            }
        }
    }
}
