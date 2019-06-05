import java.util.ArrayList;

public class Box implements ToBeStored{
    private ArrayList<ToBeStored> objects;
    private double maxKilos;

    public Box(double maxKilos){
        this.maxKilos=maxKilos;
        objects=new ArrayList<ToBeStored>();
    }
    public double weight(){
        double weight=0;
        for(int i=0;i<objects.size();i++){
            weight+=objects.get(i).weight();
        }
        return weight;
    }
    public void add(ToBeStored object){
        if(object.weight()+weight()<=maxKilos){
            objects.add(object);
        }
    }
    @Override
    public String toString(){
        return "Box: "+objects.size()+" things, total weight "+weight()+" kg";
    }
}
