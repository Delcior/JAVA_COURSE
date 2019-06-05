package people;

public class Person {
    private String name;
    private String addres;

    public Person(String name,String addres){
        this.name=name;
        this.addres=addres;
    }
    @Override
    public String toString(){
        return this.name+"\n  "+this.addres;
    }
}
