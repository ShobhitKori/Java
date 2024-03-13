class Bicycle{
    public int gear;
    public int speed;
    
    // one constructor
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
    public void speedUp(int incrememnt) {
        speed += incrememnt;
    }
    
    public String getState() {
        return "No. of gears are " + gear + "\nSpeed of bicycle is " + speed;
    }
}

class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        seatHeight = startHeight;
    }
    
    public void setHeight(int height) {
        seatHeight = height;
    }
    @Override public String getState() {
        return (super.getState() + "\nseat height is " + seatHeight); 
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 60, 6);
        System.out.println(mb.getState());
        
        mb.setHeight(10);
        System.out.println(mb.getState());

        mb.speedUp(40);
        System.out.println(mb.getState());

        mb.applyBrake(10);
        System.out.println(mb.getState());

    }
}
