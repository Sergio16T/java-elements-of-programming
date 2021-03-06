package LanguageBasics; 

// return the index of value in sorted array, if not present return -1; 
//iterative solution 
public class BinarySearchDemo {

    int binarySearchDemo(int[] arr, int x){ // could also be written (int arr[], int x) however this form is discouraged
        // int[] values = {0, 1, 2, 3, 4, 5, 6 }; 
        int left = 0, right = arr.length -1; 

        while(left < right) {
            double mid = (left + right)/2; 
            //explicitly cast double to int,
            int midIndex = (int) Math.floor(mid); 
            // System.out.println(midIndex);

           if(arr[midIndex] == x) return midIndex; 
           
           if(arr[midIndex] > x) {
               right = midIndex - 1; 
           } else {
               left = midIndex + 1; 
           }
        }
        return arr[left] == x ? left : -1; 
    }
    public static void main(String[] args) {
        int[] values = { 11, 12, 13, 14, 15, 16, 17 }; 
        BinarySearchDemo demo = new BinarySearchDemo(); 

        int result = demo.binarySearchDemo(values, 16); 

        System.out.println("index of x:" + result);
    }
}
// public static void main(String[] args)

//recursive solution 

class RecursiveBinarySearch { 
    // Returns index of x if it is present in arr[l.. 
    // r], else return -1 
    int binarySearch(int[] arr, int left, int right, int x) { 
        if (right >= left) { 
            int mid = left + (right - left) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) return binarySearch(arr, left, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, right, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) { 
        RecursiveBinarySearch ob = new RecursiveBinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
}

// Java implementation of iterative Binary Search 
//iterative solution 2
class IterativeBinarySearch { 
    // Returns index of x if it is present in arr[], 
    // else return -1 
    int binarySearch(int[] arr, int x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            // Check if x is present at mid 
            if (arr[m] == x) 
                return m; 
  
            // If x greater, ignore left half 
            if (arr[m] < x) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        // if we reach here, then element was 
        // not present 
        return -1; 
    } 
  
    // Driver method to test above 
    public static void main(String[] args) 
    { 
        IterativeBinarySearch ob = new IterativeBinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int x = 10; 
        int result = ob.binarySearch(arr, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at "
                               + "index " + result); 
    } 
} 
