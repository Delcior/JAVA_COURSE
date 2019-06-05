import java.util.HashMap;
import java.util.ArrayList;
public class Dictionary {
    private HashMap<String,String> mapOfWords;

    public Dictionary(){
        this.mapOfWords=new HashMap<String, String>();
    }
    public void add(String word,String translation){
        this.mapOfWords.put(word,translation);

    }
    public String translate(String word){
        String result=mapOfWords.get(word);
        if(result==null){
            return null;
        }
        return result;
    }
    public int amountOfWords(){
        return  mapOfWords.size();
    }
    public ArrayList<String> translationList(){
        StringBuilder keyValue=new StringBuilder();
        ArrayList<String> result = new ArrayList<String>(amountOfWords());
        for(String key: this.mapOfWords.keySet()){
            keyValue.append(key).append(" = ").append(translate(key));
            result.add(keyValue.toString());
            keyValue.replace(0,keyValue.length(),"");
        }
        return result;
    }
}
