package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {
    private final File  file;
    private Scanner reader;

    public Analysis(File file){
        this.file=file;
    }
    public int lines(){
        int lines=0;
        try {
            reader = new Scanner(file);
        }catch (Exception e){
            System.out.println("nie mozna owtorzyc pliku");
        }

        while(reader.hasNextLine()){
            reader.nextLine();
            lines++;
        }
        reader.close();
        return lines;
    }
    public int characters(){
        int chars=0;
        try {
            reader = new Scanner(file);
        }catch (Exception e){
            System.out.println("nie mozna owtorzyc pliku");
        }
        while(reader.hasNextLine()){
            chars+=reader.nextLine().length()+1;
        }
        return chars;
    }
}
