import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> listOfPlayers;
    private int maxSize=16;

    public Team(String name){
        this.name=name;
        this.listOfPlayers= new ArrayList<Player>();
    }
    public String getName(){
        return this.name;
    }
    public void addPlayer(Player player){
        if(this.listOfPlayers.size()<this.maxSize)
        this.listOfPlayers.add(player);
    }
    public void printPlayers(){
        for(Player player:listOfPlayers){
            System.out.println(player);
        }
    }
    //maxSize teamu
    public void setMaxSize(int maxSize){
        this.maxSize=maxSize;
    }
    public int size(){
        return this.listOfPlayers.size();
    }
    public int goals(){
        int totalGoals=0;
        for(Player player:listOfPlayers){
            totalGoals+=player.goals();
        }
        return totalGoals;
    }
}
