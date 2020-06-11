package multiDimensionalArrays;

public class MultidimensionalArray {
    public static void main(String[] args) {

        //create 2 dimensional array
//        double[][] o = {
//                {10.0, 2.0, 3.0},
//                {4.0, 5.0, 6.0, 9.0},
//                {7.0},
//        };

        int[][] o = {
                {1, -6, 5},
                {4, -8, 17, -9},
                {7},
        };

        for (int i = 0; i < o.length; ++i) {
            for(int j = 0; j < o[i].length; ++j) {
                System.out.println(o[i][j]);
            }
        }

        for (int[] innerArray: o){
            for (int data : innerArray){
                System.out.println(data);
            }
        }
        //Calculate the length of each row
//        System.out.println("Length of row 1: " + o[0].length);
//        System.out.println("Length of row 2: " + o[1].length);
//        System.out.println("Length of row 3: " + o[2].length);
    }
}
