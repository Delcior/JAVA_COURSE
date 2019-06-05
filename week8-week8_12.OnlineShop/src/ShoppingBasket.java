import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    private List<Purchase> purchases;

    public ShoppingBasket(){
        purchases =new ArrayList<Purchase>();
    }
    public void add(String product, int price){
        for(Purchase rachunek:purchases){
            if(rachunek.getName()==product){
                rachunek.increaseAmount();
                return;
            }
        }
        purchases.add(new Purchase(product,price));
    }
    public int price(){
        int total=0;
        for(Purchase rachunek: purchases){
            total+=rachunek.price();
        }
        return total;
    }
    public void print(){
        for(Purchase rachunek: purchases){
            System.out.println(rachunek);
        }
    }

}
