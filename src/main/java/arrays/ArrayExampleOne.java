package arrays;

public class ArrayExampleOne {
    public static void main(String[] args) {
        String[] name = new String[5];
        name[0] = "Ondia";
        name[1] = "Neveah";
        name[2]= "Brown";
        for (int i = 0; i < 5; ++i) {
            System.out.println("Element at index " + i +": " + name[i]);
        }
//        for (int i = 0; i < 5; ++i){
//       //     System.out.println(name[i]);
//        }


        double[] fingers = {10.0, 4.0, 7.0, 12.0, 5.0};
        for (int x = 0; x < 5; ++x){
//            System.out.println("Number of fingers at index " + x
//                    + ": " + fingers[x]);
        }

//        System.out.println(name[0]);
//        System.out.println(name[1]);
//        System.out.println(name[2]);
//        System.out.println(name[3]);
//        System.out.println(name[4]);
    }
}
