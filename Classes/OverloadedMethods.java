package Classes; 

// Suppose that you have a class that can use calligraphy to draw various types of data (strings, integers, and so on)
//  and that contains a method for drawing each data type.
// In the Java programming language, you can use the same name for all the drawing methods 
// but pass a different argument list to each method. Th

// Note: Overloaded methods should be used sparingly, as they can make code much less readable.

public class OverloadedMethods {
    
    public void draw(String s) { //void expresses to the reader that this method does not return a value 
        
    }
    public void draw(int i) {
        
    }
    public void draw(double f) {
        
    }
    public void draw(int i, double f) {
        
    }
}