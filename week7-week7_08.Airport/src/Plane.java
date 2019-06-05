public class Plane {
    private String planeID;
    private int capacity;

    public Plane(String planeID,int capacity){
        this.planeID=planeID;
        this.capacity=capacity;
    }
    public String getPlaneID() {
        return planeID;
    }
    @Override
    public String toString(){
        return planeID+" ("+capacity+" ppl)";
    }
}
