class account {
    public String name; //all package + class can access it 
    protected String Email; //all files package. can access it only 
    private String password; // only it can be access by the same class
// getter and setter are used to access private access modifier 
public String getPassword(){
    
    return this.password;
}

    public void setPassword(String pass){
        this.password=pass;
    }
    

}

public class oop4 {
    public static void main(String[] args) {

        account acc1 = new account();
        acc1.name="Zubayer";
        acc1.Email="abdullahzubayertalukder@gmail.com";
        acc1.setPassword("ffjf");

        // Accessing and printing the values
        System.out.println("Name: " + acc1.name);
        System.out.println("Email: " + acc1.Email);
        System.out.println("Password: " + acc1.getPassword());

    }
}
