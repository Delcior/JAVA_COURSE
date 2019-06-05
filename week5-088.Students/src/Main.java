
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        ArrayList<Student> tabOfStudents = new ArrayList<Student>();

        while(true){
            String name,numberOfStudent;
            System.out.print("name: ");
            name=reader.nextLine();
            if(!name.isEmpty()){
                System.out.print("studentnumber: ");
                numberOfStudent=reader.nextLine();
                tabOfStudents.add(new Student(name,numberOfStudent));
            }else{
                break;
            }
        }
        for(Student student: tabOfStudents){
            System.out.println(student);
        }
        System.out.print("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result: ");
        for(Student student: tabOfStudents){
            if(student.getName().contains(search)){
                System.out.println(student);
            }
        }
    }
}
