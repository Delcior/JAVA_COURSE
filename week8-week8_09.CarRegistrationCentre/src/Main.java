
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // below is the same examle program as in the assignment
        VehicleRegister ar = new VehicleRegister();
        ar.add( new RegistrationPlate("FI", "AAA-111"), "Arto");
        ar.add( new RegistrationPlate("FI", "BBB-222"), "Pekka");
        ar.add( new RegistrationPlate("FI", "CCC-333"), "cetto");
        ar.printRegistrationPlates();
    }
}
