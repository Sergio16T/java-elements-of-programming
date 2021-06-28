package Classes;

public class ProtectedInnerClass {
    protected InnerClass1 ic;

    public ProtectedInnerClass() {
	ic = new InnerClass1();
    }

    public void displayStrings() {
	System.out.println(ic.getString() + ".");
	System.out.println(ic.getAnotherString() + ".");
    }

    static public void main(String[] args) {
        ProtectedInnerClass c1 = new ProtectedInnerClass();
	    c1.displayStrings();
    }

    protected class InnerClass1 {
        public String getString() {
            return "InnerClass1: getString invoked";
        }

        public String getAnotherString() {
            return "InnerClass1: getAnotherString invoked";
        }
    }
}
