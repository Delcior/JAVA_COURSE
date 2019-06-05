public class Purchase {
    private String product;
    private int amount=1;
    private int unitPrice;

    public Purchase(String product,int amount,int unitPrice){
        this.amount=amount;
        this.product=product;
        this.unitPrice=unitPrice;
    }
    public Purchase(String product,int unitPrice){
        this.product=product;
        this.unitPrice=unitPrice;
    }
    public int price(){
        return amount*unitPrice;
    }
    public void increaseAmount(){
        amount++;
    }
    public String getName(){
        return product;
    }
    @Override
    public String toString(){
        return product+": "+amount;
    }
}
