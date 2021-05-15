package FunctionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

//Higher Order Function
public class HOF {
    public static void main(String[] args) {
        BiFunction<Float, Float, Float> divide = (x, y) -> x / y;

        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> isValidDivisor = (func) -> {
            return (x, y) -> {
                if (y == 0f) {
                    return -1f; // appending f to end of number to represent float number otherwise will be double or int depending on value
                }
                return func.apply(x, y);
            };
        };

        BiFunction<Float, Float, Float> divideValue = isValidDivisor.apply(divide);

        System.out.println(divideValue.apply(10f, 0f));
    }
}
