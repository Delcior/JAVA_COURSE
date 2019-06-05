import java.util.ArrayList ;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;

    public Hand(){
        hand = new ArrayList<Card>();
    }
    public void add(Card card){
        hand.add(card);
    }
    public void print(){
        for(Card card:hand){
            System.out.println(card);
        }
    }
    public void sort(){
        Collections.sort(hand);
    }
    public void sortAgainstSuit(){
        Collections.sort(hand,new SortAgainstSuitAndValue());
    }
    @Override
    public int compareTo(Hand hand){
        int hand1=0,hand2=0;
        for(Card card:this.hand){
            hand1+=card.getValue();
        }
        for(Card card:hand.hand){
            hand2+=card.getValue();
        }
        if(hand1>hand2){
            return 1;
        }else if(hand1<hand2){
            return -1;
        }
        return 0;
    }
}
