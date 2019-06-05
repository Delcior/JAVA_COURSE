import java.util.ArrayList;

public class Player implements Comparable<Player>{
    private String name;
    private int score;
    private ArrayList<Integer> listOfJumps;

    public Player(String name){
        this.name=name;
        listOfJumps=new ArrayList<Integer>();
        score=0;
    }
    public void addScore(int score,int jump){
        this.score+=score;
        listOfJumps.add(jump);
    }
    public void printJumpLengts(){
        System.out.println("jump lengths: "+listOfJumps);
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return name+" ("+score+" points)";
    }
    @Override
    public int compareTo(Player player){
        return this.score-player.score;
    }
}
