
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        int size=0;
        for(int size1:array){
            size++;
        }
        if(size==1){
            System.out.print(array[0]);
        }else{
            for(int i=0;i<size-1;i++){
                System.out.print(array[i]+", ");
            }
            System.out.print(array[size-1]);
        }
    }
}
