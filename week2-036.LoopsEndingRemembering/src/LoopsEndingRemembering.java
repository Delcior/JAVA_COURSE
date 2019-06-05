import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        int number,sum=0,count=0,even=0,odd=0;
        System.out.println("Type numbers:");
        while(true){
            number=Integer.parseInt(reader.nextLine());
            System.out.println(number);
            if(number==-1){
                System.out.println("Thank you and see you later!");
                break;
            }
            if(number%2==0){
                even++;
            }else{
                odd++;
            }
            sum+=number;
            count++;
        }
        System.out.println("The sum is "+sum);
        System.out.println("How many numbers: "+count);
        System.out.println("Average: "+((double)sum/count));
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);
    }
}
