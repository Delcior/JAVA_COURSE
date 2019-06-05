import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density){
        this.density=density;
        this.height=10;
        this.width=20;
    }
    public NightSky(int width,int height){
        this.width=width;
        this.height=height;
        this.density=0.1;
    }
    public NightSky(double density,int width,int height){
        this.width=width;
        this.height=height;
        this.density=density;

    }
    public void printLine(){
        Random randomizer=new Random();
        for(int i=0;i<this.width;i++){
            if(randomizer.nextDouble()<=this.density) {
                System.out.print("*");
                this.starsInLastPrint++;
            }
        }
    }
    public void print(){
        this.starsInLastPrint=0;
        for(int i=0;i<this.height;i++){
            this.printLine();

        }
        System.out.println();
    }
    public int starsInLastPrint(){
        return this.starsInLastPrint;
    }
}
