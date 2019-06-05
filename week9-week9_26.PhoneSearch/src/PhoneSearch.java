import java.util.*;

public class PhoneSearch {
    private Scanner reader;
    private List<Person> listOfPersons;


    public PhoneSearch(Scanner reader){
        this.listOfPersons=new ArrayList<Person>();
        this.reader=reader;
    }
    public void start(){
        printMenu();
        while(getCommand()){}
    }
    private boolean getCommand(){
        System.out.print("\ncommand: ");
        String command=reader.nextLine();

        switch (command){
            case "1":
                addNumber();break;
            case "2":
                searchForNumber();break;
            case "3":
                searchByNum();break;
            case "4":
                addAddress();break;
            case "5":
                break;
            case "6":
                remove();break;
            case "7":
                break;
            case "x":
                return false;

        }
        return true;
    }
    private void addNumber(){
        String name = whoseNumber();
        if(!contains(name))
            listOfPersons.add(new Person(name));

        for(Person person:listOfPersons){
            if(person.getName().equals(name)){
                person.addNumber(getNumber());
            }
        }

    }
    private void searchForNumber(){
        Person person=getPerson(whoseNumber());
        if(person==null)
            System.out.println("  not found");
        person.printNumbers();
    }
    private void searchByNum(){
        Person person=getPerson(getNumber());
                System.out.println("  "+person.getName());

    }
    private void addAddress(){
        Person person = getPerson(whoseAddress());
        System.out.println("street: ");
        String street=reader.nextLine();
        System.out.println("city: ");
        String city=reader.nextLine();
        person.setAddress(street,city);

    }
    private void personalInfo(){
        System.out.println("whose information: ");
        String name=reader.nextLine();

        Person person = getPerson(name);
        System.out.println("  address: "+person);
    }
    private void remove(){
        System.out.println("whose information: ");
        listOfPersons.remove(getPerson(reader.nextLine()));
    }
    private String whoseNumber(){
        System.out.print("whose number: ");
        return reader.nextLine();
    }
    private String whoseAddress(){
        System.out.print("whose address: ");
        return reader.nextLine();
    }
    private String getNumber(){
        System.out.print("number: ");
        return reader.nextLine();
    }
    private void printMenu(){
        StringBuilder sB = new StringBuilder("");
        sB.append("phone search\n").append("available operations:\n");
        sB.append(" 1 add a number\n");
        sB.append(" 2 search for a number\n");
        sB.append(" 3 search for a person by phone number\n");
        sB.append(" 4 add an address");
        sB.append(" 5 search for personal information\n");
        sB.append(" 6 delete personal information\n");
        sB.append(" 7 filtered listing\n");
        sB.append(" x quit");

        System.out.println(sB);
    }
    private boolean contains(String name){
        for(Person person:listOfPersons){
            if(person.getName().equals(name))
                return true;
        }
        return false;
    }
    private Person getPerson(String name){
        for(Person person:listOfPersons){
            if(person.getName().equals(name)||person.contains(name))
                return person;
        }
        return null;
    }
}
