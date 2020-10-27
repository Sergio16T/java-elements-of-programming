package Interfaces.Shapes;

public interface Relatable {
        
    // this (object calling isLargerThan)
    // and other must be instances of 
    // the same class returns 1, 0, -1 
    // if this is greater than, 
    // equal to, or less than other
    public int isLargerThan(Relatable other);
}
// If you want to be able to compare the size of similar objects, no matter what they are, the class that instantiates them should implement Relatable.