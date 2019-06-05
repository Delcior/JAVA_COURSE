package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    private Map<String, Set<String>> map;

    public PersonalMultipleEntryDictionary(){
        map=new HashMap<String,Set<String>>();
    }
    public void add(String word,String entry){
        if(!map.containsKey(word))
            map.put(word,new HashSet<String>());

        this.map.get(word).add(entry);
    }
    public Set<String> translate(String word){
        if(map.containsKey(word))
            return map.get(word);
        return null;
    }
    public void remove(String word){
        map.remove(word,map.get(word));
    }
}
