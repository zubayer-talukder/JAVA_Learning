// abstraction useage 

abstract class Animal{
    // blueprint that exist but we cannot do animal actually
 abstract void walk();

}
class Horse extends Animal{
public void walk(){
    System.out.println("Walks on 4 legs");
}
}


class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class oop5 {
    public static void main (String[] args){
        Horse h1 = new Horse();
        h1.walk();
        Chicken c1= new Chicken();
        c1.walk();
    }
}
