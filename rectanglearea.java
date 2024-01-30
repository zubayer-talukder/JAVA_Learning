//area of a rectangle = length * breadth
import java.util.*;
import java.io.*;
public  class rectanglearea{
 public static void main (String [] args){
Scanner input = new Scanner (System.in);
double area, length, breadth ;
System.out.println( "Enter Length and Breadth : ");
// dynamic memory allocate korci
length =input.nextDouble();
//input eivabe ney java te 
breadth=input.nextDouble();
area=length*breadth;
System.out.println("The area of a Rectangle is : "+area);
// message er sathe akta  variable er man print korte chaile  ei vabe("String"+ varable_name) ei vabe print kore 
}
}
 