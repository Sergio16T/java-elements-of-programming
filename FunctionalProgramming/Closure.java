package FunctionalProgramming;

import FunctionalProgramming.Interfaces.NoArgFunction;

public class Closure {
    public static void main(String [] args) {
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
            String name = "Appa";
            return () -> "Hello " + name;
        };
        NoArgFunction<String> greeter = createGreeter.apply();

        System.out.println(greeter.apply());
    }
}
