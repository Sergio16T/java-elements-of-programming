package Classes.PersonExample;
import java.util.List;
import java.util.function.Predicate;
// the Predicate interface is a generic interface 
// interface Predicate<Person> {
//     boolean test(Person t);
// }
import java.util.function.Consumer;
//a functional interface that contains an abstract method that can take one argument of a class type and returns void.
//The Consumer<T> interface contains the method void accept(T t), which has these characteristics
import java.util.ArrayList;


interface CheckPerson {
    boolean test(Person p);
}

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    // LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
        // ...
        return 1;
    }

    public void printPerson() {
        // ...
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
    public static void printPersonsWithPredicate( List<Person> roster, Predicate<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
    public static void processPersons(
    List<Person> roster,
    Predicate<Person> tester,
    Consumer<Person> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                block.accept(p);
            }
        }
    }   


}

//because a functional interface contains only one abstract method, 
//you can omit the name of that method when you implement it. 
//To do this, instead of using an anonymous class expression, you use a lambda expression
//example with lambda expression: 
//printPersonsWithPredicate(
//     roster,
//     p -> p.getGender() == Person.Sex.MALE
//         && p.getAge() >= 18
//         && p.getAge() <= 25
// );

// processPersons(
//      roster,
//      p -> p.getGender() == Person.Sex.MALE
//          && p.getAge() >= 18
//          && p.getAge() <= 25,
//      p -> p.printPerson()
// );



 class MyLambdaClass {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach( (n) -> { System.out.println(n); } );
  }
}