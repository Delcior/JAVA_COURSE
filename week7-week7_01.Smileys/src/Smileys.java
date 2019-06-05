
public class Smileys {
    private static void printWithSmileys(String characterString){
        if(characterString.length()%2==0){
            for(int i=0;i<3;i++){
                if(i==1){
                    System.out.println(":) "+characterString+" :)");
                }else{
                    for(int k=0;k<(":) "+characterString+" :)").length()/2;k++){
                        System.out.print(":)");
                    }
                    System.out.println();
                }
            }
        }else if(characterString.length()%2!=0){
            for(int i=0;i<3;i++){
                if(i==1){
                    System.out.println(":) "+characterString+"  :)");
                }else{
                    for(int k=0;k<(":) "+characterString+"  :)").length()/2;k++){
                        System.out.print(":)");
                    }
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("\\:D/");
        printWithSmileys("87.");
    }

}
