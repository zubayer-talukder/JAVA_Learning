// method overriding : Function overriding means when the child class contains the method which is already present in the parent class. Hence, the child class overrides the method of the parent class. In case of function overriding, parent and child classes both contain the same function with a different definition. child class overrride the parent class. The call to the function is determined at runtime is known as runtime polymorphism.

class a {//parent class 
 public int add (int n1,int n2){
 return n1+n2;
}
}
class b extends a{ //child class
    public int add (int n1,int n2){
        return n1+n2+1;
       }
}

public class oop1 {
    public static void main(String [] args){
        b adding = new b();
        System.out.println(adding.add(4, 9));
    }
}
