import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String,Integer> products;
    private Map<String,Integer> productsStock;
    public Storehouse(){
        products=new HashMap<String,Integer>();
        productsStock=new HashMap<String, Integer>();
    }

    public void addProduct(String product,int price,int stock){
        products.put(product,price);
        productsStock.put(product,stock);
    }
    public int price(String product){
        if(products.containsKey(product))
            return products.get(product);
        return -99;
    }
    public int stock(String product){
        if(productsStock.containsKey(product))
            return productsStock.get(product);
        return 0;
    }
    public boolean take(String product){
        if(productsStock.containsKey(product)&&productsStock.get(product)>0){
            productsStock.put(product,productsStock.get(product)-1);
            return true;
        }
        return false;
    }
    public Set<String> products(){
        return products.keySet();
    }
}
