package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {
    private final File file;
    private Scanner reader;
    private List<String> list;

    public WordInspection(File file) throws Exception{
        this.file=file;
        this.list=new ArrayList<String>();
        copyWords(file);
    }
    public int wordCount()  {
        return list.size();
    }
    public List<String> wordsContainingZ()throws Exception{
        List<String> listOfWords=new ArrayList<String>();
        for(String word:list){
            if(word.contains("z"))
                listOfWords.add(word);
        }
        return listOfWords;
    }
    public List<String> wordsEndingInL()throws Exception{
        List<String> listOfWords=new ArrayList<String>();
        for(String word:list){
            if(word.charAt(word.length()-1)=='l')
                listOfWords.add(word);
        }
        return listOfWords;
    }
    public List<String> palindromes(){
        List<String> listOfWords=new ArrayList<String>();
        for(String word:list){
            String reverse="";
            for(int i=word.length()-1;i>=0;i--) {
                reverse+=word.charAt(i);
            }
            if (word.equals(reverse))
                listOfWords.add(word);
        }
        return listOfWords;
    }
    public List<String> wordsWhichContainAllVowels(){
        List<String> listOfWords=new ArrayList<String>();
        for(String word:list){
            if(word.contains("a")&&word.contains("e")&&word.contains("i")&&word.contains("o")&&word.contains("u")&&word.contains("y")&&word.contains("ä")&&word.contains("ö"))
                listOfWords.add(word);
        }
        return listOfWords;
    }
    private void copyWords(File file) throws Exception{
        reader=new Scanner(file,"UTF-8");
        while(reader.hasNext()){
                list.add(reader.next());
        }
    }
}
