package Classes.Inheritance;

enum Gender {
    MALE,
    FEMALE,
}

public class SuperExamples {
    Integer age;

    SuperExamples(Integer age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println("The value of the variable named age in super class is: " + age);
    }

    public void display() {
        System.out.println("This is the display method of superclass");
        System.out.println("Age: " + this.age);
    }
}

class Subclass extends SuperExamples {
    Gender gender;

    Subclass(Integer age, Gender gender) {
        super(age);
        this.gender = gender;
    }

    public void display() {
        System.out.println("This is the display method of subclass");
        System.out.println("Age: " + this.age + "\nGender: " + this.gender);
    }

    public void displaySuper() {
        // Invoking the display() method of super class
        super.display();
    }

    public static void main(String args[]) {
        Subclass subClassExample = new Subclass(24, Gender.FEMALE);

        subClassExample.getAge();
        subClassExample.displaySuper();

        // Invoking the display() method of sub class
        subClassExample.display();
    }
}
