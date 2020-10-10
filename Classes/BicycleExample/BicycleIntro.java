package Classes.BicycleExample; 

public class BicycleIntro {
        
    // the Bicycle class has
    // three fields
    public int cadence;
    public int gear;
    public int speed;
    // The fields of Bicycle are named cadence, gear, and speed and are all of data type integer (int). 
    // The public keyword identifies these fields as public members, accessible by any object that can access the class.
        
    // the Bicycle class has
    // one constructor
    public BicycleIntro(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has
    // four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
        
}
// A class declaration for a MountainBike class that is a subclass of Bicycle might look like this:
class MountainBike extends BicycleIntro {
        
    // the MountainBike subclass has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   

}

// MountainBike inherits all the fields and methods of Bicycle and adds the field seatHeight and a method to set it (mountain bikes have seats that can be moved up and down as the terrain demands).