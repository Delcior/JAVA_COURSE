package people;

public class Student extends Person {
    private int credits;

    public Student(String name,String addres){
        super(name,addres);
        this.credits=0;
    }
    public void study(){ this.credits++;}
    public int credits(){ return this.credits;}


    @Override
    public String toString(){
        return super.toString()+"\n  credits "+this.credits;
    }
}
