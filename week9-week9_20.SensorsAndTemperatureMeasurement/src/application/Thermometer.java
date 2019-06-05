package application;

import java.util.Random;

public class Thermometer implements Sensor{
//    private boolean isOn;
//
//    public Thermometer(){isOn=false;}
//    public boolean isOn(){if(isOn)return true; return false;}  // returns true if the sensor is on
//    public void on(){this.isOn=true;}       // switches the sensor on
//    public void off(){this.isOn=false;}      // switches the sensor off
//    public int measure(){if(isOn)return (int)(Math.round(Math.random()*60-30)); throw new IllegalStateException();}

    private final Random random;
    private Boolean status;

    public Thermometer() {
        this.random = new Random();
        this.status = false;
    }

    @Override
    public boolean isOn() {
        return this.status;
    }

    @Override
    public void on() {
        this.status = true;
    }

    @Override
    public void off() {
        this.status = false;
    }

    @Override
    public int measure() {

        if (!this.isOn()) {
            throw new IllegalStateException("Thermometer is turned off.");
        } else {
            int randomNum = random.nextInt(30 - (-30) + 1) - 30;
            return randomNum;
        }
    }
}
