class Pen {
    String color;
    String types;

    public void write() {
        System.out.println("Writing Something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

public class oop {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.types = "Gel";
        pen1.write();
        pen1.printColor();

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.types = "BallPoint";
        pen2.write();
        pen2.printColor();
    }
}
