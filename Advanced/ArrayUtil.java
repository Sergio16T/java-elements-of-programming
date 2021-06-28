package Advanced;
// Java program to retrieve a Slice of a Primitive Array with ability for start and end indices to be negative, indicating an offset from the end of the sequence.

import java.util.Arrays;

public class ArrayUtil {

     // Note: Using Java Generics, primitive types such as int can not be used, must use class type i.e. Integer

    /**
     * @param <T> the class of the objects in the array
     * @param original the array from which a range is to be copied
     *
     * @param startIndex the initial index of the range to be copied, inclusive.
     * A negative index can be used, indicating an offset from the end of the sequence. slice(-2) extracts the
     * last two elements in the sequence.
     *
     * @param endIndex the final index of the range to be copied, exclusive.
     *     (This index may lie outside the array.)
     * A negative index can be used, indicating an offset from the end of the sequence. slice(2,-1) extracts the
     * third element through the second-to-last element in the sequence.
     *
     * @return a new array containing the specified range from the original array,
     *     truncated or padded with zeros to obtain the required length
     * @throws ArrayIndexOutOfBoundsException if {@code startIndex < 0}
     *     or {@code startIndex > original.length}
     * @throws IllegalArgumentException if {@code startIndex > endIndex}
     * @throws NullPointerException if {@code original} is null
     * @since 1.0
    */
    public static <T> T[] slice(T[] original, int startIndex, int endIndex) {

        if (startIndex < 0 || startIndex > original.length) {
            throw new ArrayIndexOutOfBoundsException("startIndex " + startIndex + " out of bounds for source array " + original.getClass().getComponentType() + "[" + original.length + "]");
        } else if (endIndex < 0) {
            endIndex = original.length + endIndex;
        }

        // return slice of the Array via copyOfRange(T[] source, int startIndex, int endIndex)
        T[] slice = Arrays.copyOfRange(original, startIndex, endIndex);

        // return the slice
        return slice;
    }

    /**
     * @param <T> the class of the objects in the array
     * @param original the array from which a range is to be copied
     *
     * @param startIndex the initial index of the range to be copied, inclusive.
     * A negative index can be used, indicating an offset from the end of the sequence. slice(-2) extracts the
     * last two elements in the sequence.
     *
     * @return a new array containing the specified range from the original array. Beginning from startIndex and extracting through the end of the sequence
     *
     * @throws ArrayIndexOutOfBoundsException if {@code startIndex > original.length}
     * @throws NullPointerException if {@code original} is null
     * @since 1.0
    */
    public static <T> T[] slice(T[] original, int startIndex) {
        if (startIndex > original.length) {
            throw new ArrayIndexOutOfBoundsException("startIndex " + startIndex + " out of bounds for source array " + original.getClass().getComponentType() + "[" + original.length + "]");
        }
        if (startIndex < 0) {
            startIndex = original.length + startIndex;
        }
        // return slice of the Array via copyOfRange(T[] source, int startIndex, int endIndex)
        T[] slice = Arrays.copyOfRange(original, startIndex, original.length);

        // return the slice
        return slice;
    }

    // Method declarations with primitive types

     /**
     * @param original the array from which a range is to be copied
     *
     * @param startIndex the initial index of the range to be copied, inclusive.
     * A negative index can be used, indicating an offset from the end of the sequence. slice(-2) extracts the
     * last two elements in the sequence.
     *
     * @param endIndex the final index of the range to be copied, exclusive.
     *     (This index may lie outside the array.)
     * A negative index can be used, indicating an offset from the end of the sequence. slice(2,-1) extracts the
     * third element through the second-to-last element in the sequence.
     *
     * @return a new array containing the specified range from the original array,
     *     truncated or padded with zeros to obtain the required length
     * @throws ArrayIndexOutOfBoundsException if {@code startIndex < 0}
     *     or {@code startIndex > original.length}
     * @throws IllegalArgumentException if {@code startIndex > endIndex}
     * @throws NullPointerException if {@code original} is null
     * @since 1.0
    */
    public static int[] slice(int[] original, int startIndex, int endIndex) {

        if (startIndex < 0 || startIndex > original.length) {
            throw new ArrayIndexOutOfBoundsException("startIndex " + startIndex + " out of bounds for source array " + original.getClass().getComponentType() + "[" + original.length + "]");
        } else if (endIndex < 0) {
            endIndex = original.length + endIndex;
        }
        // return slice of the Array via copyOfRange(T[] source, int startIndex, int endIndex)
        int[] slice = Arrays.copyOfRange(original, startIndex, endIndex);

        // return the slice
        return slice;
    }

     /**
     * @param original the array from which a range is to be copied
     *
     * @param startIndex the initial index of the range to be copied, inclusive.
     * A negative index can be used, indicating an offset from the end of the sequence. slice(-2) extracts the
     * last two elements in the sequence.
     *
     * @param endIndex the final index of the range to be copied, exclusive.
     *     (This index may lie outside the array.)
     * A negative index can be used, indicating an offset from the end of the sequence. slice(2,-1) extracts the
     * third element through the second-to-last element in the sequence.
     *
     * @return a new array containing the specified range from the original array,
     *     truncated or padded with zeros to obtain the required length
     * @throws ArrayIndexOutOfBoundsException if {@code startIndex < 0}
     *     or {@code startIndex > original.length}
     * @throws IllegalArgumentException if {@code startIndex > endIndex}
     * @throws NullPointerException if {@code original} is null
     * @since 1.0
    */
    public static long[] slice(long[] original, int startIndex, int endIndex) {

        if (startIndex < 0 || startIndex > original.length) {
            throw new ArrayIndexOutOfBoundsException("startIndex " + startIndex + " out of bounds for source array " + original.getClass().getComponentType() + "[" + original.length + "]");
        } else if (endIndex < 0) {
            endIndex = original.length + endIndex;
        }
        // return slice of the Array via copyOfRange(T[] source, int startIndex, int endIndex)
        long[] slice = Arrays.copyOfRange(original, startIndex, endIndex);

        // return the slice
        return slice;
    }

     /**
     * @param original the array from which a range is to be copied
     *
     * @param startIndex the initial index of the range to be copied, inclusive.
     * A negative index can be used, indicating an offset from the end of the sequence. slice(-2) extracts the
     * last two elements in the sequence.
     *
     * @param endIndex the final index of the range to be copied, exclusive.
     *     (This index may lie outside the array.)
     * A negative index can be used, indicating an offset from the end of the sequence. slice(2,-1) extracts the
     * third element through the second-to-last element in the sequence.
     *
     * @return a new array containing the specified range from the original array,
     *     truncated or padded with zeros to obtain the required length
     * @throws ArrayIndexOutOfBoundsException if {@code startIndex < 0}
     *     or {@code startIndex > original.length}
     * @throws IllegalArgumentException if {@code startIndex > endIndex}
     * @throws NullPointerException if {@code original} is null
     * @since 1.0
    */
    public static float[] slice(float[] original, int startIndex, int endIndex) {

        if (startIndex < 0 || startIndex > original.length) {
            throw new ArrayIndexOutOfBoundsException("startIndex " + startIndex + " out of bounds for source array " + original.getClass().getComponentType() + "[" + original.length + "]");
        } else if (endIndex < 0) {
            endIndex = original.length + endIndex;
        }
        // return slice of the Array via copyOfRange(T[] source, int startIndex, int endIndex)
        float[] slice = Arrays.copyOfRange(original, startIndex, endIndex);

        // return the slice
        return slice;
    }

     /**
     * @param original the array from which a range is to be copied
     *
     * @param startIndex the initial index of the range to be copied, inclusive.
     * A negative index can be used, indicating an offset from the end of the sequence. slice(-2) extracts the
     * last two elements in the sequence.
     *
     * @param endIndex the final index of the range to be copied, exclusive.
     *     (This index may lie outside the array.)
     * A negative index can be used, indicating an offset from the end of the sequence. slice(2,-1) extracts the
     * third element through the second-to-last element in the sequence.
     *
     * @return a new array containing the specified range from the original array,
     *     truncated or padded with zeros to obtain the required length
     * @throws ArrayIndexOutOfBoundsException if {@code startIndex < 0}
     *     or {@code startIndex > original.length}
     * @throws IllegalArgumentException if {@code startIndex > endIndex}
     * @throws NullPointerException if {@code original} is null
     * @since 1.0
    */
    public static double[] slice(double[] original, int startIndex, int endIndex) {

        if (startIndex < 0 || startIndex > original.length) {
            throw new ArrayIndexOutOfBoundsException("startIndex " + startIndex + " out of bounds for source array " + original.getClass().getComponentType() + "[" + original.length + "]");
        } else if (endIndex < 0) {
            endIndex = original.length + endIndex;
        }
        // return slice of the Array via copyOfRange(T[] source, int startIndex, int endIndex)
        double[] slice = Arrays.copyOfRange(original, startIndex, endIndex);

        // return the slice
        return slice;
    }


     /**
     * @param original the array from which a range is to be copied
     *
     * @param startIndex the initial index of the range to be copied, inclusive.
     * A negative index can be used, indicating an offset from the end of the sequence. slice(-2) extracts the
     * last two elements in the sequence.
     *
     * @param endIndex the final index of the range to be copied, exclusive.
     *     (This index may lie outside the array.)
     * A negative index can be used, indicating an offset from the end of the sequence. slice(2,-1) extracts the
     * third element through the second-to-last element in the sequence.
     *
     * @return a new array containing the specified range from the original array,
     *     truncated or padded with zeros to obtain the required length
     * @throws ArrayIndexOutOfBoundsException if {@code startIndex < 0}
     *     or {@code startIndex > original.length}
     * @throws IllegalArgumentException if {@code startIndex > endIndex}
     * @throws NullPointerException if {@code original} is null
     * @since 1.0
    */
    public static char[] slice(char[] original, int startIndex, int endIndex) {

        if (startIndex < 0 || startIndex > original.length) {
            throw new ArrayIndexOutOfBoundsException("startIndex " + startIndex + " out of bounds for source array " + original.getClass().getComponentType() + "[" + original.length + "]");
        } else if (endIndex < 0) {
            endIndex = original.length + endIndex;
        }
        // return slice of the Array via copyOfRange(T[] source, int startIndex, int endIndex)
        char[] slice = Arrays.copyOfRange(original, startIndex, endIndex);

        // return the slice
        return slice;
    }

     /**
     * @param original the array from which a range is to be copied
     *
     * @param startIndex the initial index of the range to be copied, inclusive.
     * A negative index can be used, indicating an offset from the end of the sequence. slice(-2) extracts the
     * last two elements in the sequence.
     *
     * @param endIndex the final index of the range to be copied, exclusive.
     *     (This index may lie outside the array.)
     * A negative index can be used, indicating an offset from the end of the sequence. slice(2,-1) extracts the
     * third element through the second-to-last element in the sequence.
     *
     * @return a new array containing the specified range from the original array,
     *     truncated or padded with zeros to obtain the required length
     * @throws ArrayIndexOutOfBoundsException if {@code startIndex < 0}
     *     or {@code startIndex > original.length}
     * @throws IllegalArgumentException if {@code startIndex > endIndex}
     * @throws NullPointerException if {@code original} is null
     * @since 1.0
    */
    public static short[] slice(short[] original, int startIndex, int endIndex) {

        if (startIndex < 0 || startIndex > original.length) {
            throw new ArrayIndexOutOfBoundsException("startIndex " + startIndex + " out of bounds for source array " + original.getClass().getComponentType() + "[" + original.length + "]");
        } else if (endIndex < 0) {
            endIndex = original.length + endIndex;
        }
        // return slice of the Array via copyOfRange(T[] source, int startIndex, int endIndex)
        short[] slice = Arrays.copyOfRange(original, startIndex, endIndex);

        // return the slice
        return slice;
    }

     /**
     * @param original the array from which a range is to be copied
     *
     * @param startIndex the initial index of the range to be copied, inclusive.
     * A negative index can be used, indicating an offset from the end of the sequence. slice(-2) extracts the
     * last two elements in the sequence.
     *
     * @param endIndex the final index of the range to be copied, exclusive.
     *     (This index may lie outside the array.)
     * A negative index can be used, indicating an offset from the end of the sequence. slice(2,-1) extracts the
     * third element through the second-to-last element in the sequence.
     *
     * @return a new array containing the specified range from the original array,
     *     truncated or padded with zeros to obtain the required length
     * @throws ArrayIndexOutOfBoundsException if {@code startIndex < 0}
     *     or {@code startIndex > original.length}
     * @throws IllegalArgumentException if {@code startIndex > endIndex}
     * @throws NullPointerException if {@code original} is null
     * @since 1.0
    */
    public static byte[] slice(byte[] original, int startIndex, int endIndex) {

        if (startIndex < 0 || startIndex > original.length) {
            throw new ArrayIndexOutOfBoundsException("startIndex " + startIndex + " out of bounds for source array " + original.getClass().getComponentType() + "[" + original.length + "]");
        } else if (endIndex < 0) {
            endIndex = original.length + endIndex;
        }
        // return slice of the Array via copyOfRange(T[] source, int startIndex, int endIndex)
        byte[] slice = Arrays.copyOfRange(original, startIndex, endIndex);

        // return the slice
        return slice;
    }

    // TO DO: add negative offset functionality
    public static Integer[] nativeSlice (Integer[] arr, int start, int end) {

        // Initialize Array With length determined by subtracting endIndex - startIndex
        Integer[] slice = new Integer[end - start];

        // Copy elements of arr to slice
        for (Integer i = 0; i < slice.length; i++) {
            slice[i] = arr[start + i];
        }

        // return the slice
        return slice;
    }

    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 3, 4, 5 };
        char[] arr3 = { '1', '2', '3', '4', '5' };

        int start = 2,
            end = 4;

        // slice using Class Types
        Integer[] slice = slice(arr, start, end + 1);
        System.out.println("slice with Generics start index 2, end index 5: " + Arrays.toString(slice));

        Integer[] slice2 = nativeSlice(arr, start, end);
        System.out.println("Native slice implementation start index 2, end index 4:" + Arrays.toString(slice2));

        // Java.util.Arrays.copyOfRange method
        int[] slice3 = Arrays.copyOfRange(arr2, start, end);
        System.out.println("Simply using copyOfRange start index 2, end index 4:" + Arrays.toString(slice3));

        // Slice using Primitive Types
        int[] slice4 = slice(arr2, start, end);
        System.out.println("slice with method defined with primitive type int start index 2, end index 4: " + Arrays.toString(slice4));

        char[] slice5 = slice(arr3, start, end);
        System.out.println("slice with method defined with primitive type char start index 2, end index 4: " + Arrays.toString(slice5));

        // slice 2 arguments original and startIndex
        Integer[] sliceWithoutEndArg = slice(arr, 2);
        System.out.println("sliceWithoutEndArg with start index 2: " + Arrays.toString(sliceWithoutEndArg));

        // slice with 3 arguments and negative offset for endIndex
        Integer[] sliceWithEndOffset = slice(arr, 1, -2);
        System.out.println("slice with second arg negative start index 1 endIndex -2: " + Arrays.toString(sliceWithEndOffset));

        // slice 2 args with negative offset
        Integer[] sliceWithOffset = slice(arr, -2);
        System.out.println("slice with 2 arguments & negative offset startIndex -2: " + Arrays.toString(sliceWithOffset));

        // Throws java.lang.ArrayIndexOutOfBoundsException
        // Integer[] throwOOBException = slice(arr, 6, 3);
        // System.out.println("Start index greater than length array index out of bounds exception: " + Arrays.toString(throwOOBException));

        // startIndex at maxValue arr.length
        Integer[] maxStart = slice(arr, 5);
        System.out.println("Start index equal to max a.k.a array.length - returns empty array: " + Arrays.toString(maxStart));

    }
}

