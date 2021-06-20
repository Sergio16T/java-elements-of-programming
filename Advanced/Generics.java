package Advanced;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    // Generic Type T
    public static <T> List<T> arrayToList(T[] array, List<T> list) {
        for (T item : array) {
            list.add(item);
        }
        return list;
    }

    public static void main(String[] args) {
        // Example without generics
        List list = new ArrayList(); // Warnings from compiler
        list.add("Anna"); // Type Safety Warning
        String name = (String) list.get(0); // explicit casting of value to string is required here
        System.out.println("first name: " + name);
        list.add(7); // adding an Integer would not result in a compile error allowing addition of multiple types

        // Example with generics
        List<String> listWithGen = new ArrayList<String>();
        listWithGen.add("String");
        String firstItem = listWithGen.get(0); // Additional Advantage of casting to type not being required
        System.out.println(firstItem);
        // listWithGen.add(8); this is not allowed since list is parameterized with type String and leads to compile time error


        Character[] charArray = {'s', 'a'};
        List<Character> listOfChars = arrayToList(charArray, new ArrayList<Character>());
        System.out.println(listOfChars);
    }
}
