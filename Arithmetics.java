public class Arithmetics {
    public static void  main(String[]args){
        int result=10-2 ;
       double results =(double)10/56;
        System.out.println(result);
        System.out.println(results);

        //pre increment and post increment
        int x=2;
        int y=x++;
        System.out.println("the value of X is :- "+x);
        System.out.println("the value of Y is :- "+y);
        // y er value bare nai karon holo x man agge copy kore y er vitore dise and then pore baki  gula hoise 
        // ak kothay post increment 

        // pre increment 
        int p=32;
        int q=++p;
        System.out.println("The value of P is : "+p);
        System.out.println("The value of Q is : "+q);
        // ei khane p er value er prothome agge increment korse than value ta copy korse tai value 2 ta soman ei khane 
    }
}
