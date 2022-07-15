package javacode.section5practice;
// check OOChallange.kt
public class MountainBike extends Bicycle{

    private int seatHeight;

    public MountainBike(int seatHeight, int cadence, int gear, int speed) {
        super(cadence, gear, speed);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("seat Heat" + seatHeight);
    }
}
