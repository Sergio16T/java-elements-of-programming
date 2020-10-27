package Classes.Car;

enum Direction {
    RIGHT, LEFT
}
//The interface body can contain abstract methods, default methods, and static methods.
public interface OperateCar {

    // constant declarations, if any
 
    // method signatures
    
    int turn(Direction direction, double radius, double startSpeed, double endSpeed);

    int changeLanes(Direction direction, double startSpeed, double endSpeed);

    int signalTurn(Direction direction,boolean signalOn);

    int getRadarFront(double distanceToCar, double speedOfCar);

    int getRadarRear(double distanceToCar, double speedOfCar);
    //   ...... 
    // more method signatures
 }