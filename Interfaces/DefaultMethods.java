package Interfaces;

/*
In a typical design based on abstractions, where an interface has one or multiple implementations, if one or more
methods are added to the interface, all the implementations will be forced to implement them too.

Default interface methods are an efficient way to deal with this issue. They allow us to add new methods to an interface
that are automatically available in the implementations. Thus, there's no need to modify the implementing classes.
*/
public interface DefaultMethods {
    // regular interface methods

    default void defaultMethod() {
    // default method implementation
    }
}
