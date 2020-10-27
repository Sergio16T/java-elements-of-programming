package Classes;

public class InnerClassEx {
    
    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
    
    public InnerClassEx() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    
    public void printEven() {
        
        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public static Boolean isEvenIndex(Integer index) {
        return index % 2 == 0; 
        // if (index % 2 == 0) return Boolean.TRUE; // Can also access True or false via Boolean
        // return Boolean.FALSE;
    }

    public static Boolean isOddIndex(Integer index) {
        return !(index % 2 == 0); 
    }
    
    interface DataStructureIterator extends java.util.Iterator<Integer> { } 

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
    
    private class EvenIterator implements DataStructureIterator {
        
        // Start stepping through the array from the beginning
        private int nextIndex = 0;
        
        public boolean hasNext() {
            
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }        
        
        public Integer next() {
            
            // Record a value of an even index of the array
            Integer returnValue = Integer.valueOf(arrayOfInts[nextIndex]);
            
            // Get the next even element
            nextIndex += 2;
            return returnValue;
        }
    }
    
    public static void main(String s[]) {
        
        // Fill the array with integer values and print out only
        // values of even indices
        InnerClassEx ds = new InnerClassEx();
        ds.printEven();
        System.out.println(InnerClassEx.isOddIndex(3));
    }
}
//The output is:

//0 2 4 6 8 10 12 14 