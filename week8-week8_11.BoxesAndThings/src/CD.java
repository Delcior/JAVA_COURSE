public class CD implements ToBeStored{
    private String artist;
    private String title;
    int publishingYear;
    double weight=0.1;

    public CD(String artist,String title,int publisingYear){
        this.publishingYear=publisingYear;
        this.artist=artist;
        this.title=title;
    }
    public double weight(){
        return this.weight;
    }
    @Override
    public String toString(){
        return this.artist+": "+this.title+" ("+this.publishingYear+")";
    }
}
