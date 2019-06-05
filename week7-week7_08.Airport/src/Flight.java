import java.util.HashMap;

public class Flight {
    private String depAirportCode;
    private String destAirportCode;
    private Plane plane;

    public Flight(String depAirportCode,String destAirportCode,Plane plane){
        this.depAirportCode=depAirportCode;
        this.destAirportCode=destAirportCode;
        this.plane=plane;
    }
    @Override
    public String toString(){
        return plane+" ("+depAirportCode+"-"+destAirportCode+")";
    }
}
