import java.util.Scanner;

public class Reader {
   private Scanner reader;

   public Reader(){
       reader=new Scanner(System.in);
   }
   public String readString(){
       return this.reader.nextLine();
   }
   public int readInteger(){
       return Integer.parseInt(this.reader.nextLine());
   }
}
