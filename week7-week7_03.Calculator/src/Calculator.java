public class Calculator {
    private Reader reader;
    private int calculations;

    public Calculator(){
        this.reader =new Reader();
    }
    public void start() {
        this.calculations=0;
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }else if (command.equals("sum")) {
                sum();
            }else if (command.equals("difference")) {
                difference();
            }else if (command.equals("product")) {
                product();
            }else{
                continue;
            }
        }

        statistics();
    }
    private void sum(){
        System.out.print("value1: ");
        int value1 = this.reader.readInteger();// read the value using the Reader-object
                System.out.print("value2: ");
        int value2 = this.reader.readInteger();// read the value using the Reader-object
        // print the value according to the example above
        System.out.println("Sum of the values "+(value1+value2));
        this.calculations++;
    }
    private void difference(){
        System.out.print("value1: ");
        int value1 = this.reader.readInteger();// read the value using the Reader-object
        System.out.print("value2: ");
        int value2 = this.reader.readInteger();// read the value using the Reader-object
        // print the value according to the example above
        System.out.println("Difference of the values "+(value1-value2));
        this.calculations++;
    }
    private void product(){
        System.out.print("value1: ");
        int value1 = this.reader.readInteger();// read the value using the Reader-object
        System.out.print("value2: ");
        int value2 = this.reader.readInteger();// read the value using the Reader-object
        // print the value according to the example above
        System.out.println("Product of the values "+(value1*value2));
        this.calculations++;
    }
    private void statistics(){
        System.out.println("Calculations done "+this.calculations);
    }

}
