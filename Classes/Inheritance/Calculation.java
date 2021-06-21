package Classes.Inheritance;

public class Calculation {
    int z;

    public void addition(int x, int y) {
       z = x + y;
       System.out.println("The sum of the given numbers:"+z);
    }

    public void subtraction(int x, int y) {
       z = x - y;
       System.out.println("The difference between the given numbers:"+z);
    }


 }

class My_Calculation extends Calculation {
    public void multiplication(int x, int y) {
       z = x * y;
       System.out.println("The product of the given numbers:"+z);
    }

    public static void main(String args[]) {
      int a = 20, b = 10;
      My_Calculation demo = new My_Calculation();
      // Inherits methods from parent class
      demo.addition(a, b);
      demo.subtraction(a, b);
      demo.multiplication(a, b);

      Calculation demo1 = new My_Calculation();   // This also works since My_Calculation is a sub class of Calculation
      demo1.addition(a, b);
      demo1.subtraction(a, b);
      // However since it's using the super class reference variable it cannot use multiplication method since it is not defined for the type Calculation

    }
 }