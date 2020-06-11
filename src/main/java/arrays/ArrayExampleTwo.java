package arrays;

public class ArrayExampleTwo {
    public static void main(String[] args) {
        int[] numbers = {-9, -25, -50, 1, 100, 76, -20};
        int sum = 0;
        Double average;

        for (int number: numbers){
            sum += number;
        }
        int arrayLength = numbers.length;

        //casting
        average = ((double)sum / (double)arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
