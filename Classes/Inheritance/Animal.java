package Classes.Inheritance;

/*
Examples of Static vs Instance Methods and Overiding and hiding methods.

Notes:
An instance method in a subclass with the same signature (name, plus the number and the type of its parameters) and return type as an instance method in the superclass overrides the superclass's method.

If a subclass defines a static method with the same signature as a static method in the superclass, then the method in the subclass hides the one in the superclass.

The distinction between hiding a static method and overriding an instance method has important implications:
- The version of the overridden instance method that gets invoked is the one in the subclass.
- The version of the hidden static method that gets invoked depends on whether it is invoked from the superclass or the subclass.

*/

public class Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}


class Dog extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Dog");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Dog");
    }

    public static void main(String[] args) {
        Animal superAnimal = new Animal();
        Dog myDog = new Dog();
        Animal myAnimal = myDog;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();

        Dog.testClassMethod();
        superAnimal.testInstanceMethod();
    }
}