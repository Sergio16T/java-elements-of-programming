package FunctionalProgramming;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Stream Class with utilities for working with arrays as streams
public class Streams {
    // stream functions do not mutate the original lists they are called on - they return new streams

    public List<Integer> doubleIntegersInList(Integer[] array) {
        List<Integer> listOfIntegers= Arrays.asList(array); // OR List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(list));
        Function<Integer, Integer> timesTwo = (n) -> n * 2;

        List<Integer> doubled = listOfIntegers
            .stream()
            .map(timesTwo)
            .collect(Collectors.toList());

        return doubled;
    }

    public List<Integer> retrieveEvenIntegers(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        Predicate<Integer> isEven = (n) -> n % 2 == 0;

        List<Integer> filteredList = list
            .stream()
            .filter(isEven)
            .collect(Collectors.toList());

        return filteredList;
    }

    public List<String> retrieveMoreThan4Letters(String[] array) {
        Predicate<String> moreThan4Letters = (s) -> s.length() > 4;
        List<String> list = Arrays.stream(array)
            .filter(moreThan4Letters)
            .collect(Collectors.toList());

        return list;
    }

    public static Function<Integer, Predicate<String>> stringGreaterThan = (minLength) -> {
        return (str) -> str.length() > minLength;
    };

    public List<String> filterByNumberOfCharacters(String[] array, Integer length) {
        List<String> list = Arrays.asList(array)
            .stream()
            .filter(stringGreaterThan.apply(length))
            .collect(Collectors.toList());

        return list;
    }

    public Integer sum(Integer[] array) {
        Integer sum = Arrays.stream(array)
            .reduce(0, (startValue, number) -> startValue + number);
        return sum;
    }

    public Optional<String> findLongestWord(String[] array) {
        BinaryOperator<String> getLongestWord = (startValue, element) -> {
            // System.out.println("startValue: " + startValue + "\n" + "element: " + element + "\n");
            return startValue.length() > element.length() ? startValue : element;
        };

        Optional<String> longestWord = Arrays.stream(array)
            // .reduce((startValue, element) -> {
            //     System.out.println("startValue: " + startValue + "\n" + "element: " + element + "\n");
            //     return startValue.length() > element.length() ? startValue : element;
            // });
            .reduce(getLongestWord);

            return longestWord;
    }

    public static void main(String[] args) {
        Streams useStream = new Streams();

        Integer[] listOfIntegers = {1, 2, 3, 4, 5};

        // Integer Examples
        List<Integer> doubled = useStream.doubleIntegersInList(listOfIntegers);
        List<Integer> evenList = useStream.retrieveEvenIntegers(listOfIntegers);
        Integer sum = useStream.sum(listOfIntegers);

        System.out.print("doubled: " + doubled + "\n");
        System.out.print("even: " + evenList + "\n");
        System.out.print("sum: " + sum + "\n");
        System.out.println("set index 0 to 10 and remove element at index 1 in even list");
        evenList.set(0, 10);
        evenList.remove(1);
        System.out.println("even list item at index 0: " + evenList.get(0));
        System.out.println("even list size: " + evenList.size());

        // String Examples
        String[] arrayOfStrings = {"Apple", "Facebook", "Google", "Netflix", "Tech"};
        String[] emptyArray = {};

        List<String> moreThan4Letters = useStream.retrieveMoreThan4Letters(arrayOfStrings);
        List<String> moreThan5Letters = useStream.filterByNumberOfCharacters(arrayOfStrings, 5);

        Optional<String> longestWord = useStream.findLongestWord(arrayOfStrings);
        Optional<String> longestWord2 = useStream.findLongestWord(emptyArray);

        System.out.println("more than 4: " + moreThan4Letters);
        System.out.println("more than 5: " + moreThan5Letters);
        System.out.print("longest word: ");

        longestWord.ifPresent(System.out::println);

        String longestWordResult = longestWord.get();
        System.out.println("longestWordResult: " + longestWordResult);

        Consumer<String> log = (s) -> System.out.println(s);

        if (longestWord2.isEmpty()) {
            log.accept("empty");
        }

    }
}