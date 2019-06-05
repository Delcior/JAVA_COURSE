import java.util.ArrayList;
import java.util.Arrays;
public class Main {

    public static int smallest(int[] array){
        int min=array[0];
        for(int i:array){
            if(i<min){
                min=i;
            }
        }
        return min;
    }
    public static int indexOfTheSmallest(int[] array){
        int theIndexOfSmallest = 0;

        for (int i = 0; i < array.length; i++) {
            if ( array[i]<array[theIndexOfSmallest]) {
                theIndexOfSmallest = i;
            }
        }
        return theIndexOfSmallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        int min=array[index];
        int k=array.length;
        int indexSaved=index;
        for(int i=index;i<k;i++){
            if(array[i]<min){
                min=array[i];
                indexSaved=i;
            }
        }

        return indexSaved;
    }
    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int valOfInex1=array[index1];
        array[index1]=array[index2];
        array[index2]=valOfInex1;
    }
    public static void sort(int[] array) {
        int length=array.length;
        int index;
        for(int i=0;i<length;i++){
            if(i!=(index=indexOfTheSmallestStartingFrom(array,i))){
                swap(array,i,index);
            }else {
                continue;
            }
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        // write testcode here
        int[] values = {-1, 3, 1, 7, 4, 5,2,4,3};
        System.out.println(indexOfTheSmallestStartingFrom(values, 7));

    }

}
