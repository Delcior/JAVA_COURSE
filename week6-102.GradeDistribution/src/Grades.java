import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> tabOfScores ;
    private int accepted=0,total=0;

    public Grades(){
        this.tabOfScores=new ArrayList<Integer>();
        for(int i=0;i<6;i++){
            tabOfScores.add(0);
        }
    }
    public void giveScore(int score){
        if(score>=0&&score<=60){
                total++;
                if(score>=0&&score<=29){
                    this.tabOfScores.set(0,this.tabOfScores.get(0)+1);
                }else if(score>=30&&score<=34){
                    this.accepted++;
                    this.tabOfScores.set(1,this.tabOfScores.get(1)+1);
                }else if(score>=35&&score<=39){
                    this.accepted++;
                    this.tabOfScores.set(2,this.tabOfScores.get(2)+1);
                }else if(score>=40&&score<=44){
                    this.accepted++;
                    this.tabOfScores.set(3,this.tabOfScores.get(3)+1);
                }else if(score>=45&&score<=49){
                    this.accepted++;
                    this.tabOfScores.set(4,this.tabOfScores.get(4)+1);
                }else if(score>=50&&score<=60){
                    this.accepted++;
                    this.tabOfScores.set(5,this.tabOfScores.get(5)+1);
                }
        }else{
            return;
        }
    }
    public void debug(){
        System.out.println(this.tabOfScores.get(0));
    }
    public void results(){
        System.out.println("Grade distribution:");
        for(int i=5;i>=0;i--){
            System.out.print(i+": ");
            for(int k=0;k<this.tabOfScores.get(i);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public double accepted(){
        return (100*this.accepted)/(double)this.total;
    }
}
