public class Book implements ToBeStored{
    private String writer;
    private String name;
    double weight;

    public Book(String writer,String name,double weight){
        this.weight=weight;
        this.writer=writer;
        this.name=name;
    }
    public double weight(){
        return this.weight;
    }
    @Override
    public String toString(){
        return this.writer+": "+this.name;
    }
}
