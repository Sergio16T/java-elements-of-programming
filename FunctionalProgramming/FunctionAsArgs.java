package FunctionalProgramming;
import java.util.function.BiFunction;

public class FunctionAsArgs {
    public static class MyMath {
        public static Integer add(Integer x, Integer y) {
            return x + y;
        }
        public static Integer subtract(Integer x, Integer y) {
            return x - y;
        }
        public static Integer mathOperation(Integer x, Integer y, BiFunction<Integer, Integer, Integer> op) {
            return op.apply(x, y);
        }

    }

    public static void main(String[] args) {
        Integer result = MyMath.mathOperation(2, 3, MyMath::add);
        Integer result2 = MyMath.mathOperation(2, 3, (x, y) -> 2 * (x + y));
        System.out.println(result);
        System.out.println(result2);
    }
}