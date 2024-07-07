
// Outer class
class Outer {
    private int outerData = 10;
    // Inner class
    class Inner {
    void display() {
    System.out.println("Outer data: " + outerData);
    }
    }
    }
    public class inner_outer {
    public static void main(String[] args) {
    // Creating an instance of the outer class
    Outer outer = new Outer();
    // Creating an instance of the inner class using outer class instance
    Outer.Inner inner = outer.new Inner();
    // Calling a method of the inner class
    inner.display(); // Output: Outer data: 10
    }
    }