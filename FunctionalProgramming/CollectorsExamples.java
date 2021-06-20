package FunctionalProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class CollectorsExamples {
    private String[] array = {"Apple", "Facebook", "Facebook", "Google", "Netflix", "Tech"};
    private List<String> list = Arrays.asList(array);

    public Long countOfStringsGreaterThan(Integer length) {
        Stream<String> streamOfStrings = list
            .stream()
            .filter(Streams.stringGreaterThan.apply(length));

        Long count = streamOfStrings
            .collect(Collectors.counting());// returns count of items

        return count;
    }

    public String stringJoiningExample() {
        String joinedStrings = list
            .stream()
            .collect(Collectors.joining(", ")); // joins items in steam into a string joined by separator

        return joinedStrings;
    }


    public Map<String, Integer> proceduralMapStringsToNumberOfOccurences(String[] array) {
        // Return a map with values in string and the number of times they appear in array
        HashMap<String, Integer> mapping = new HashMap<>();
        // map over items in list and if mapping contains item increment value otherwise add key with value 1

        for (int i = 0; i < array.length; i++) {
            String element = array[i];

            if (mapping.containsKey(element)) {
                mapping.put(element, mapping.get(element) + 1);
            } else {
                mapping.put(element, 1);
            }
        }

        return mapping;
    }

    public Map<String, Long> functionalMapStringsToNumberOfOccurences(String[] array) {
        /*
        groupingBy(Function<? super T,? extends K> classifier, Collector<? super T,A,D> downstream)
        Returns a Collector implementing a cascaded "group by" operation on input elements of type T,
        grouping elements according to a classification function, and then performing a reduction operation
        on the values associated with a given key using the specified downstream Collector. */

        Map<String, Long> result = Arrays.asList(array).stream()
            .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
            /* groupingBy(classifier, downstream);
            // classifier is a function to determine the keys(classifiers) that it will be groupedBy
            // downstream is the Collector that will determine the value of the keys
            */
            // collect(Supplier, BiConsumer, BiConsumer)
        return result;
    }

    public void groupWordsByLengthExample() {
        /* groupingBy with 1 argument:
        groupingBy(Function<? super T,? extends K> classifier)
        Returns a Collector implementing a "group by" operation on input elements of type T,
        grouping elements according to a classification function, and returning the results in a Map.
        */
        Map<Integer, List<String>> wordLengthMap = list
            .stream()
            .collect(Collectors.groupingBy((word) -> { // divides up elements from the stream intro different groups and returns a map of those different groups
                return word.length();
            }));

        System.out.println("groupingBy word length example: " + wordLengthMap);
    }

    public void partitionWordsByLengthExample() {
        Map<Boolean, List<String>> wordLengthMap = list
            .stream()
            .collect(Collectors.partitioningBy((word) -> { // partitions into groups that either pass or fail the Predicate provided
                return word.length() > 5;
            }));

        System.out.println("partitioningBy words greather than 5 example: " +  wordLengthMap);
    }

    public static void main(String[] args) {
        CollectorsExamples examples = new CollectorsExamples();

        String[] array = {"Apple", "Facebook", "Facebook", "Google", "Netflix", "Tech"};

        examples.groupWordsByLengthExample();
        examples.partitionWordsByLengthExample();
        System.out.println("functional map strings to count of strings:" + examples.functionalMapStringsToNumberOfOccurences(array));
        System.out.println("procedural map strings to count of strings:" + examples.proceduralMapStringsToNumberOfOccurences(array));
        System.out.println("count of strings length greater than 5: " +  examples.countOfStringsGreaterThan(5));
        System.out.println("Array of strings joined with , : " +  examples.stringJoiningExample());


    }
}
