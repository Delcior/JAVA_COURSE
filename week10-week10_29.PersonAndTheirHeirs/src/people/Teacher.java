package people;

public class Teacher extends Person{
    private int salary;

    public Teacher(String name,String addres,int salary){
        super(name,addres);
        this.salary=salary;
    }
    @Override
    public String toString(){
        return super.toString()+"\n  salary "+this.salary+" euros/month";
    }
}
