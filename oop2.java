// inheretance

class Shape{ // base class or parent class
    String color;
public void area (){
    System.out.println("Displays Area");
}
}

class triangle extends Shape{ // sub class or child class
 public void area(int l, int h){
    System.out.println(1/2*l*h);
 }
}
public class oop2 {
    public static void main (String [] args){
triangle t1 = new triangle();
t1.color="Blue";

    }
}
