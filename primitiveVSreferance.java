
import java.awt.*;
public class primitiveVSreferance {
    public static void main(StringApplication[]args) {
       // primitive type variable

       /* 

        byte x=3;
        byte y=x;
        x=2;
        System.out.println(y);

        */
         //Referance Type
         Point point1 =new Point(1 ,2);
         Point point2=point1;
         point1.x=22;
         System.out.println(point2);
         //mone raktte hobe je referance type e sudu arkta memory er value ke referance kore.
         
         //onno dik e  primitive type e akta notun memory te value ke create kore oi memory te data store kore
 
    }
}
