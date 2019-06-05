import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class VehicleRegister {

    private LinkedHashMap<RegistrationPlate,String> vehicleRegister;
    public VehicleRegister(){
        vehicleRegister = new LinkedHashMap<RegistrationPlate,String>();
    }

    public boolean add(RegistrationPlate plate,String owner){
        if(vehicleRegister.containsKey(plate)){
            return false;
        }

        vehicleRegister.put(plate,owner);
        return true;
    }
    public String get(RegistrationPlate plate){
        if(vehicleRegister.containsKey(plate)){
            return vehicleRegister.get(plate);
        }
        return null;
    }
    public boolean delete(RegistrationPlate plate){
        if (vehicleRegister.containsKey(plate)) {
            vehicleRegister.remove(plate);
            return true;
        } else {
            return false;
        }
    }
    public void printRegistrationPlates(){
        for (RegistrationPlate key : vehicleRegister.keySet()) {
            System.out.println(key);
        }
    }
    public void printOwners() {
        ArrayList<String> owner = new ArrayList<String>();

        for (RegistrationPlate key : vehicleRegister.keySet()) {
            String ownerName = vehicleRegister.get(key);
            if (!owner.contains(ownerName)) {
                owner.add(ownerName);
            }
        }

        for (String name : owner) {
            System.out.println(name);
        }
    }

}
