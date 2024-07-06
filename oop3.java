//access modifier
class a{
    public String name;
   

    // Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

    protected int age ;
   
    // Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.

    private int income;
    // Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.

class account(){
    name ="Abdullah Zubayer Talukder";
    age = 34;
    income =999;
}
}
public class oop3{
public static void main (String[] args){
    account obj1= new account();
   System.out.println(obj1.name);
   System.out.println(obj1.age);
   //system.out.println(obj1.income); 
   //income private kora ase tai eita access kora jabe na



}}