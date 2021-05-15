package FunctionalProgramming.Interfaces;
/**
 *  Represents a function that accepts zero arguments and produces a result.
 *
 *  <p>This is a <a href="package-summary.html">functional interface</a>
 *  whose functional method is {@link #apply(Object)}.
 *
 *  @param <R> the type of the result of the function
 *
 *  @since 1.8
*/

@FunctionalInterface
public interface NoArgFunction<R> {
      R apply();
}

