package FunctionalProgramming;

import java.util.function.BiFunction;

import FunctionalProgramming.Interfaces.NoArgFunction;
import FunctionalProgramming.Interfaces.TriFunction;


public class lesson1MultiArgFunction {
    public static void main(String [] args) {
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(1, 2));

        TriFunction<Integer, Integer, Integer, Integer> add3 = (x, y, z) -> x + y + z;
        System.out.println(add3.apply(1, 2, 3));

        NoArgFunction<String> sayHello = () -> "Hello";
        System.out.println(sayHello.apply());
    }
}