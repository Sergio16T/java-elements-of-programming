package FunctionalProgramming;

import java.util.function.Function;

import FunctionalProgramming.Interfaces.NoArgFunction;

public class FunctionReturnsFunction {
    public static class MyMath {
        public static Integer times2(Integer x) {
            return x * 2;
        }
        public static Integer times3(Integer x) {
            return x * 3;
        }
        public static Integer times4(Integer x) {
            return x * 4;
        }
        public static Function<Integer, Integer> createMultiplier(Integer y) {
            return (Integer x) -> x * y;
        }

    }
    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
            return () -> "Hello Function";
        }; // OR () -> () -> "Hello Function!";

        Function<Integer, Integer> timesTwo = MyMath.createMultiplier(2);
        Function<Integer, Integer> timesThree = MyMath.createMultiplier(3);
        Integer result = timesTwo.apply(5);
        Integer result2 = timesThree.apply(5);

        NoArgFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());
        System.out.println(result);
        System.out.println(result2);
    }
}
