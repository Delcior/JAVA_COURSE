import java.io.File;
import java.util.Scanner;

public class Printer {
    private final File file;
    private Scanner fileReader;

    public Printer(String fileName)throws Exception{
        this.file=new File(fileName);
    }
    public void printLinesWhichContain(String word)throws Exception {
        this.fileReader=new Scanner(this.file);
            String line;
            while(fileReader.hasNextLine()){
                line=fileReader.nextLine();
                if(line.contains(word))
                    System.out.println(line);
            }
        fileReader.close();
    }
}
