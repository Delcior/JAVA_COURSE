
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String,String> nicks= new HashMap<String,String>();

        nicks.put("matti","mage");
        nicks.put("mikael","mixu");
        nicks.put("arto","arppa");

        System.out.println(nicks.get("mikael"));
    }

}
