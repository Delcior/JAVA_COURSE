import java.lang.StringBuilder;
public class Change {
    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter,char toCharacter){
        this.fromCharacter=fromCharacter;
        this.toCharacter=toCharacter;
    }
    public String change(String characterString){
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<characterString.length();i++){
            if(characterString.charAt(i)==fromCharacter){
                builder.append(toCharacter);
            }else{
                builder.append(characterString.charAt(i));
            }
        }
        return builder.toString();
    }
}
