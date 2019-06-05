

public class Main {
    public static int[] copy(int[] array){
        int[] cpy= new int[array.length];
        int i=0;
        for(int each: array){
            cpy[i]=array[i];
            i++;
        }
        return cpy;
    }
    public static int[] reverseCopy(int[] array){
        int[] cpy= new int[array.length];
        for(int i=0;i<array.length;i++){
            cpy[i]=array[array.length-i-1];
        }
        return cpy;
    }
    public static void main(String[] args) {
        // write testcode here
    }
    
}
