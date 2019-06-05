import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tournament {

    private Scanner reader;
    private ArrayList<Player> listOfPlayers;
    private int roundCount;
    private UserInterface userInterface;
    public Tournament(){
        listOfPlayers=new ArrayList<Player>();
        reader=new Scanner(System.in);
        userInterface=new UserInterface();
    }

    public void newGame(){
        userInterface.printEntry();

        if(getParticipants()){
            resetRounds();
            userInterface.tournamentBegins();
            Score scoreCounter=new Score();
            while(playRound(scoreCounter)){
                anotherRound();
                listOfPlayers.sort(Player::compareTo);}
            printResults();
        }else{
            return;
        }

    }
    public boolean playRound(Score scoreCounter){
        String command;
        userInterface.printCommand();
        command=reader.nextLine();
        if(!command.equals("jump"))
            return false;
        printRounds();
        printParticipants();
        printRoundResults(scoreCounter);
        return true;
    }
    public boolean getParticipants(){
        String name;

        while(true){
            System.out.print("  Participant name: ");
            name=reader.nextLine();
            if(name.isEmpty())
                break;
            listOfPlayers.add(new Player(name));
        }
        if(listOfPlayers.size()==0)
            return false;
        return true;
    }
    public void printParticipants(){
        System.out.println("Jumping order:");
        for(int i=0;i<listOfPlayers.size();i++){
            System.out.println("  "+(i+1)+". "+listOfPlayers.get(i));
        }
    }
    public void printRoundResults(Score scoreCounter){
        System.out.println("\nResults of round "+roundCount);
        for(Player player:listOfPlayers){
            scoreCounter.jump();
            System.out.print("  "+player.getName()+"\n");
            scoreCounter.printJump();
            player.addScore(scoreCounter.getScore(),scoreCounter.getLength());
        }
    }
    public void resetRounds(){roundCount=1;}
    public void anotherRound(){roundCount++;}
    public void printRounds(){System.out.println("\nRound "+roundCount+"\n");}
    public void printResults(){
        userInterface.printEnding();
        for(int i=listOfPlayers.size()-1;i>=0;i--){
            System.out.print((listOfPlayers.size()-i)+"           "+listOfPlayers.get(i)+
                    "\n            ");listOfPlayers.get(i).printJumpLengts();
        }
    }
}
