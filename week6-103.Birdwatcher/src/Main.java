import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program

    // Your program should use only one Scanner object, i.e., it is allowed to call
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

        Scanner scanner = new Scanner(System.in);
        BirdWatcher watch = new BirdWatcher();
        boolean game=true;
        String command;
        while(game){
            System.out.print("? ");
            command=scanner.nextLine();
            switch(command){
                case "Add":
                    watch.add(scanner);
                    break;
                case "Observation":
                    watch.observation(scanner);
                    break;
                case "Statistics":
                    watch.statistics();
                    break;
                case "Show":
                    watch.show(scanner);
                    break;
                case "Quit":
                    game=false;
                    break;
                default:
                    continue;
            }
        }

    }

}



