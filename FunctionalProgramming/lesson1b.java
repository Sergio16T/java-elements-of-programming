package FunctionalProgramming;

import java.util.function.Function;

public class lesson1b {
    public static void main(String args[]) {
         Boolean isValid = args.length > 0;
         if (!isValid) {
              System.out.println("Did not provide arguments please provide a number as a string");
              return;
        }
        Integer num = Integer.parseInt(args[0]);
        Function<Integer, Integer> getAbsolute = Math::abs;
        System.out.println(getAbsolute.apply(num));
    }
}

class Chapter2Video2 {
    public static void main(String[] args) {
        Function<Integer, Integer> absoluteValue = (x) -> {
            if (x < 0) {
                 return -x;
            } else {
                 return x;
            }
        };
        Function<Integer, Integer> oneLineAbs = (x) -> x < 0 ? -x : x;

        System.out.println(absoluteValue.apply(-100));
        System.out.println(oneLineAbs.apply(-100));
    }
}