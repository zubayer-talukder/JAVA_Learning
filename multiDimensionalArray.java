import java.util.Arrays;

public class multiDimensionalArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        // normal array
        int[][]TwoDArray = new int[2][3];
        //multi dimensional Array
        TwoDArray[0][0]=54;
        System.out.println(Arrays.deepToString(TwoDArray));
        // this is a Two Dimensional Array Example.

        int [][][] threeDimensional =new int [2][3][4];
        threeDimensional[0][2][1]=74;
        System.out.println(Arrays.deepToString(threeDimensional));

        // Another way to Express multidimensional Array method
       int [][]Newpapers={{10,20,54,14},{41,47}};
System.out.println(Arrays.deepToString(Newpapers));

    }
}
