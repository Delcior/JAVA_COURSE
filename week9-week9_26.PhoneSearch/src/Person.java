import java.util.HashSet;
import java.util.Set;

public class Person implements Comparable<Person>{
    private String name;
    private String address;
    private String city;
    private Set<String> numbers;

    public Person(String name){
        this.name=name;
        this.address="address unknown";
        this.city="";
        this.numbers=new HashSet<String>();
    }
    public void addNumber(String number){this.numbers.add(number);}
    public void setAddress(String address,String city){this.address=address;this.city=city;}
    public String getName(){return this.name;}
    public void printNumbers(){
        for(int i=0;i<numbers.size();i++)
            System.out.println(" "+numbers.toArray()[i]);
    }
    public boolean contains(String number){
        if(number.contains(number))
            return true;
        return false;
    }
    @Override
    public String toString(){
        return this.address+" "+this.city;
    }
    @Override
    public int compareTo(Person person){
        return this.name.compareTo(person.name);
    }
}
