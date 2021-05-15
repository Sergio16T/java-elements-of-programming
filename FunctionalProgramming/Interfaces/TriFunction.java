package FunctionalProgramming.Interfaces;

/**
 *  Represents a function that accepts three arguments and produces a result.
 *
 *  <p>This is a <a href="package-summary.html">functional interface</a>
 *  whose functional method is {@link #apply(Object)}.
 *
 *  @param <T> the type of the first argument input to the function
 *  @param <U> the type of the second argument input to the function
 *  @param <V> the type of the third argument input to the function
 *  @param <R> the type of the result of the function
 *
 *  @since 1.8
*/
@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}