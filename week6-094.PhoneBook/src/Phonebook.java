import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> tabOfPersons;

    public Phonebook(){
        this.tabOfPersons=new ArrayList<Person>();
    }
    public void add(String name,String number){
        Person buffer=new Person(name,number);
        tabOfPersons.add(buffer);
    }
    public void printAll(){
        for(Person tab:tabOfPersons){
            System.out.println(tab);
        }
    }
    public String searchNumber(String name){
        for(Person buff : tabOfPersons){
            if(buff.getName()==name){
                return buff.getNumber();
            }
        }
        return "number not known";
    }
}
