package LanguageBasics; 
// byte[] anArrayOfBytes;
// short[] anArrayOfShorts;
// long[] anArrayOfLongs;
// float[] anArrayOfFloats;
// double[] anArrayOfDoubles;
// boolean[] anArrayOfBooleans;
// char[] anArrayOfChars;
// String[] anArrayOfStrings;

//shorthand syntax 
// int[] anArray = { 
//     100, 200, 300,
//     400, 500, 600, 
//     700, 800, 900, 1000
// };

// Here the length of the array is determined by the number of values provided between braces and separated by commas.

// You can also declare an array of arrays (also known as a multidimensional array) by using two or more sets of brackets, 
// such as String[][] names. Each element, therefore, must be accessed by a corresponding number of index values.

//int[] intArray;    //declaring array
//intArray = new int[20];  // allocating memory to array

class ArrayDemo {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];
           
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("Element at index 1: "
                           + anArray[1]);
        System.out.println("Element at index 2: "
                           + anArray[2]);
        System.out.println("Element at index 3: "
                           + anArray[3]);
        System.out.println("Element at index 4: "
                           + anArray[4]);
        System.out.println("Element at index 5: "
                           + anArray[5]);
        System.out.println("Element at index 6: "
                           + anArray[6]);
        System.out.println("Element at index 7: "
                           + anArray[7]);
        System.out.println("Element at index 8: "
                           + anArray[8]);
        System.out.println("Element at index 9: "
                           + anArray[9]);
    }
} 


class MultiDimArrayDemo {
    public static void main(String[] args) {
        // short hand syntax to create multi-dimensional array
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
    }
}
// The output from this program is:

// Mr. Smith
// Ms. Jones

// System.out.println(anArray.length); // you can print array length


