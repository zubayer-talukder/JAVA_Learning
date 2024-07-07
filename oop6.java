// interface
interface Animal{
    void walks();

}
 interface Herbivore{
public void eats(){
    System.out.println("They eats only Grass.");
}
 }

class Horse implements Animal,Herbivore{
    public void walks(){
        System.out.println("Walks on 4 Legs");
    }
}

public class oop6 {
    public static void main(String [] args){
Horse h1= new Horse();
h1.walks();
h1.eats();
    }
}
