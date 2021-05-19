package FunctionalProgramming;

import java.util.function.Function;
/*
* Immutability - keep a single source of truth, avoid shared state, avoid mutating data
* Functional Purity/Pure Functions - always returns the same output given the same input
- impure functions have an internal or external state change
* First Class Functions
*/

public class lesson1a {

    private int age = 1;

    public lesson1a() {}

    // example of impure function age may return different values at different points if setAge is called
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
         this.age = age;
    }

    // example of pure function: always returns the same output given the same input
    public int add(int x, int y) {
      return x + y;
    }
}

/* FAQ:
* Immutability
Q - Does this mean we can't have member variables?
A - No not necessarily as long as we follow immutability
if we use private final int age = 1; then a function that tries to get the age will always return 1

* First Class Functions
- First-class functions when functions in that language are treated like any other variable
- In Java functional programming includes
* functions returning functions or providing functions as arguments (Higher Order Functions)
* or even an array of functions
In java this is accomplised with the function interface

-- Functional Programming in Java we can define functions as variables with the function interface
Function(T, R)

* Lambda - short hand syntax to define new functions

- Function Interface allows us to create new functions from scratch as well

* Static Keyword
- In the Java programming language, the keyword static indicates that the particular member belongs to a
type itself, rather than to an instance of that type. This means that only one instance of that static
member is created which is shared across all instances of the class.


* protected Keyword
- The protected keyword is an access modifier used for attributes, methods and constructors, making them
accessible in the same package and subclasses.
- specifies that the member can only be accessed within its own package (as with package-private) and,
in addition, by a subclass of its class in another package.

* public Keyword
- class is visible to all classes everywhere.
This means that any other class can access a public field or method.
Further, other classes can modify public fields unless the field is declared as final

* private keyword
- is an access modifier used for attributes, methods and constructors, making them only accessible within the declared class
*/


class Chapter2Video1 {

    protected static class MyMath {
        public static Integer triple(Integer x) {
            return x * 3;
        }
    }

    public static void main(String[] args) {
        Function<Integer, Integer> myTriple = MyMath::triple; // shorthand :: to refer to the function inside MyMath. How we **refer** to an object/class's method as an object of type function instead of MyMath.triple() which is how we would call it
        Function<Integer, Integer> myLambdaPlus3 = (arg1) -> arg1 + 2 + 1;
        Function<String, Integer> lambdaStringLength = (s) -> s.length();
        Function<String, Integer> multiLineLambda = (s) -> {
            Boolean isValid = (s != null && !s.isEmpty());
            if (!isValid) {
                 return -1;
            }
            return s.length();
        };

        Integer result = myTriple.apply(5);
        Integer lambdaPlus3Result = myLambdaPlus3.apply(5);
        Integer lambdaStringLengthResult = lambdaStringLength.apply("Lambda");
        Integer multiLineResult = multiLineLambda.apply(null);
        Integer multiLineResult2 = multiLineLambda.apply("Top");

        System.out.println("myTriple result: " + result);
        System.out.println("lambdaPlus3Result: " + lambdaPlus3Result);
        System.out.println("lambdaStringLengthResult " + lambdaStringLengthResult);
        System.out.println("multiLineResult: " + multiLineResult);
        System.out.println("multiLineResult2: " + multiLineResult2);
    }
}
