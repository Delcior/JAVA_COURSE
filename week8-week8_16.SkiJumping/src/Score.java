import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Score {
    private int length;
    private ArrayList<Integer> votes;
    private Random rand;

    public Score(){
        rand=new Random();
        votes=new ArrayList<Integer>(5);
        for(int i=0;i<5;i++){
            votes.add(0);
        }
    }
    public void jump(){
        length=rand.nextInt(61)+60;
        for(int i=0;i<5;i++){
            votes.set(i,rand.nextInt(11)+10);
        }
    }
    public int getScore(){
        Collections.sort(votes);
        int result=length;
        for(int i=1;i<4;i++){
            result+=votes.get(i);
        }
        return result;
    }
    public int getLength(){return length;}
    public void printJump(){
        System.out.println("    length: "+length+"\n    judge votes: "+votes);
    }
}
