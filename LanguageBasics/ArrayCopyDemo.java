package LanguageBasics; 
// public static void arraycopy(Object src, int srcPos,
//                              Object dest, int destPos, int length)

    // Array Literal
    // In a situation, where the size of the array and variables of array are already known, array literals can be used.

    //  int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
    //  // Declaring array literal
    // The length of this array determines the length of the created array.
    // There is no need to write the new int[] part in the latest versions of Java as in below 

class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}
// The output from this program is:

// caffein


class ArrayCopyOfDemo {
    public static void main(String[] args) {
        
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
            'i', 'n', 'a', 't', 'e', 'd'};
            
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9); // start index inclusive - end index exclusive
        
        System.out.println(new String(copyTo));
    }
}