// class Pen {
//     String color;
//     String types;

//     public void write() {
//         System.out.println("Writing Something");
//     }

//     public void printColor() {
//         System.out.println(this.color);
//     }
// }

class Student{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
        
      
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }
    Student(String name, int age){
        this.name=name;
        this.age =age;

       // System.out.println("Joy Bangla");
    }

}

public class oop {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "Blue";
        // pen1.types = "Gel";
        // pen1.write();
        // pen1.printColor();

        // Pen pen2 = new Pen();
        // pen2.color = "Black";
        // pen2.types = "BallPoint";
        // pen2.write();
        // pen2.printColor();

        Student s1 = new Student("Zubayer",23);

       s1.name="Zubayer";
       s1.age=24;
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);
    }
}
