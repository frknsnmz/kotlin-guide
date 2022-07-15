package javacode.section5practice;
// check OOChallange.kt
public class RoadBike extends Bicycle{

    private int tireWidth;

    public RoadBike(int cadence, int gear, int speed, int tireWidth) {
        super(cadence, gear, speed);
        this.tireWidth = tireWidth;
    }

    public int getTireWidth() {
        return tireWidth;
    }
}
