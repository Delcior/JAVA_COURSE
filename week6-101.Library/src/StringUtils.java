public class StringUtils {
    public StringUtils(){

    }
    public static boolean included(String word,String searched){
        if(word.toLowerCase().trim().contains(searched.toLowerCase().trim()))
            return true;
        return false;
    }
}
