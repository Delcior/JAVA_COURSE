
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }
    public int cents() {
        return cents;
    }
    public Money plus(Money added){
        return new Money(this.euros+added.euros,this.cents+added.cents);
    }
    public Money minus(Money subbed){
        int eurosSub = this.euros-subbed.euros;
        int centsSub = this.cents-subbed.cents;
        if(eurosSub<0){
            return new Money(0,0);
        }else if(eurosSub>=0&&centsSub>=0){
            return new Money(eurosSub,centsSub);
        }else
            return new Money(eurosSub-1,centsSub+100);

    }
    public boolean less(Money compared){
        if(this.euros>compared.euros){
                return false;
        }else if(this.euros<compared.euros){
                return true;
        }else{
            if(this.cents>compared.cents){
                return false;
            }
            return true;
        }
    }
    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
