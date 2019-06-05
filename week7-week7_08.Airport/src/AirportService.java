import java.util.ArrayList;
import java.util.Scanner;

public class AirportService {
    private ArrayList<Plane> arrayOfPlanes;
    private ArrayList<Flight> arrayOfFlights;
    private Scanner reader;

    public AirportService(){
       // this.planeInfo=new HashMap<String,Integer>();
        reader=new Scanner(System.in);
        arrayOfPlanes=new ArrayList<Plane>();
        arrayOfFlights=new ArrayList<Flight>();
    }
    public void startService(){
        airportPanel();
    }
    private void airportPanel(){
        boolean service=true;
        System.out.println("Airport panel\n" +
            "--------------------\n");
        String command;
    while(service){
            menuAirportPanel();
            System.out.print("> ");
            command=reader.nextLine();

            switch (command){
                case "1":
                    addAirplane();
                    break;
                case "2":
                    addFlight();
                    break;
                case "x":
                    service=false;
                    break;
            }
        }
        flightService();
    }
    private void flightService(){
        System.out.println("\nFlight service\n" +
                "------------\n");
        boolean service=true;
        String command;
        while(service){
            menuFlightService();
            System.out.print("> ");
            command=reader.nextLine();

            switch (command){
                case "1":
                    printPlanes();
                    break;
                case "2":
                    printFlights();
                    break;
                case "3":
                    printPlaneInfo();
                case "x":
                    service=false;
                    break;
            }
        }
    }
    private void menuAirportPanel(){
        System.out.print("Choose operation:\n" +
                "[1] Add airplane\n" +
                "[2] Add flight\n" +
                "[x] Exit\n");
    }
    private void menuFlightService(){
        System.out.print("Choose operation:\n" +
                "[1] Print planes\n" +
                "[2] Print flights\n" +
                "[3] Print plane info\n" +
                "[x] Quit\n");
    }
    private void addAirplane(){
        System.out.print("Give plane ID: ");
        String planeID=reader.nextLine();
        System.out.print("Give plane capacity: ");
        Integer cap=Integer.parseInt(reader.nextLine());
        if(planeID.length()>0&&cap>0){
            //planeInfo.put(planeID,cap);
            arrayOfPlanes.add(new Plane(planeID,cap));
        }

    }
    private void addFlight(){
        System.out.print("Give plane ID: ");
        String planeID=reader.nextLine();

        System.out.print("Give departure airport code: ");
        String depCode=reader.nextLine();

        System.out.print("Give destination airport code: ");
        String desCode=reader.nextLine();

        //sprawdzam czy w arraylist jest samolot o takim ID
        if(contains(planeID)){
            arrayOfFlights.add(new Flight(depCode,desCode,getPlaneById(planeID)));
        }


    }
    private void printPlaneInfo(){
        System.out.print("Give plane ID: ");
        String planeID=reader.nextLine();

        System.out.println(getPlaneById(planeID));
    }
    private void printPlanes(){
        for(Plane plane:arrayOfPlanes){
            System.out.println(plane);
        }

    }
    private void printFlights(){
        for(Flight flight:arrayOfFlights){
            System.out.println(flight);
        }
    }
    private boolean contains(String name){
        for(Plane plane:arrayOfPlanes){
            if(plane.getPlaneID().equals(name)){
                return true;
            }
        }
        return false;
    }
    private Plane getPlaneById(String planeID){
        for(Plane plane:arrayOfPlanes){
            if(plane.getPlaneID().equals(planeID)){
                return plane;
            }
        }
        return null;
    }

}