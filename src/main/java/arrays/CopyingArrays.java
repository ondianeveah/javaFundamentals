package arrays;

import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;

//        for (int number: positiveNumbers){
//            System.out.println(number + ", ");
//        }
        numbers[0] = -1;
        for (int number: positiveNumbers) {
  //          System.out.print(number + ", ");
        }

        int[] source = {3, 4, 5, 6, 7, 8, 9};
        int[] destination = new int[8];

        for (int x= 0; x < source.length; ++x){
            destination[x] = source[x];
        }

        //Here, the toString() method is used to convert an array into a string.
        System.out.println(Arrays.toString(destination));
    }
}
