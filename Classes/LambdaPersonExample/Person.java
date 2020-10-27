package Classes.LambdaPersonExample;
import java.util.List;
import java.util.function.Predicate;

// the Predicate interface is a generic interface 
// interface Predicate<Person> {
//     boolean test(Person t);
// }
import java.util.function.Consumer;
//a functional interface that contains an abstract method that can take one argument of a class type and returns void.
//The Consumer<T> interface contains the method void accept(T t), which has these characteristics
import java.util.function.Function;

import java.util.ArrayList;
import java.util.Calendar;

interface CheckPerson {
    boolean test(Person p);
}

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    Calendar birthday;
    int age; 
    Sex gender;
    String emailAddress;
    
    public Person(String name, int age, Calendar birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.age = age;
        this.birthday = birthday; 
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public void printPerson() {
        // ...
        System.out.println(this.name);
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
            } else {
                System.out.println("doesn't meet criteria for tester method");
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

    public static void processPersonsWithFunction(
        List<Person> roster,
        Predicate<Person> tester,
        Function<Person, String> mapper,
        Consumer<String> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                String data = mapper.apply(p);
                block.accept(data);
            }
        }
    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        // ...
        return this.age; 
    }

    public void setAge(int age) {
        this.age = age;
    }
 
    public Calendar getBirthday() {
        return this.birthday; 
    }
    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }
    public Sex getGender() {
        return this.gender;
    }
    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

   
}

//because a functional interface contains only one abstract method, 
//you can omit the name of that method when you implement it. 
//To do this, instead of using an anonymous class expression, you use a lambda expression
//examples in myLambdaClass with lambda expressions used on the person class methods: 

 class MyLambdaClass {
  public static void main(String[] args) {
    // ArrayList<Integer> numbers = new ArrayList<Integer>();
    // numbers.add(5);
    // numbers.add(9);
    // numbers.add(8);
    // numbers.add(1);
    // numbers.forEach( (n) -> { System.out.println(n); } );

    Calendar birthday = Calendar.getInstance(); 
    birthday.set(1992, 02, 13, 0, 0); 

    Person demoLambda = new Person("Sergio", 28, birthday, Person.Sex.MALE, "st@gmail.com"); 
    ArrayList<Person> roster = new ArrayList<Person>(); 
    roster.add(demoLambda); 

    Person.printPersons(
        roster, 
        new CheckPersonEligibleForSelectiveService()
    );

    Person.printPersonsWithPredicate(
        roster,
        p -> p.getGender() == Person.Sex.MALE
            && p.getAge() >= 18
            && p.getAge() <= 25
    );
    Person.processPersonsWithFunction(
        roster,
        p -> p.getGender() == Person.Sex.MALE
            && p.getAge() >= 18
            && p.getAge() <= 30,
        p -> p.getEmailAddress(),
        email -> System.out.println(email)
    );
    Person.processPersons(
             roster,
             p -> p.getGender() == Person.Sex.MALE
                 && p.getAge() >= 18
                 && p.getAge() <= 25,
             p -> p.printPerson()
        );
    // the following example uses aggregate operations to print the e-mail addresses of those members contained in the collection roster who are eligible for Selective Service:
    // Aggregate operations process elements from a stream, not directly from a collection
    //  A stream is a sequence of elements. Unlike a collection, it is not a data structure that stores elements. 
    // Instead, a stream carries values from a source, such as collection, through a pipeline. 
    // A pipeline is a sequence of stream operations, which in this example is filter-map-forEach. 
    roster
        .stream()
        .filter(
            p -> p.getGender() == Person.Sex.MALE
                && p.getAge() >= 18
                && p.getAge() <= 25)
        .map(p -> p.getEmailAddress())
        .forEach(email -> System.out.println(email));
    }
}