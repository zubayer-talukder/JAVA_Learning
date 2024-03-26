import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        //

        /*
         * Type 1: Array Declearation
         * int[] numbers = new int[5];
         * 
         * numbers[0]=1;
         * numbers[1]=2;
         * numbers[2]=4;
         * numbers[4]=5;
         * 
         * System.out.println(Arrays.toString(numbers));
         * // method overloading use kora hoise
         * 
         * // numbers[10]=42;
         * // eita dile exception in theread asbe
         */

        // type 2: Array Decleration

        int[] numberss = { 2, 3, 45, 64, 2, 78, 45, 41, 101 };

        System.out.println(numberss.length);
        // ei vabe dile string er memory location dekhabe kaj kora difficult tai eita ke
        // de referance kore method over loading korle kaj hobe

        System.out.println(Arrays.toString(numberss));


        // Array Sorting in Java
        int [] mango={4,71,1,12,77,44,84,51,3,20,10};
        System.out.println("Without Sorted Array display :\n"+Arrays.toString(mango));
        Arrays.sort(mango);
        System.out.println(Arrays.toString(mango));
    }
}
