package loops;

public class ForLoop {
    public static void main(String[] args) {
        float sum = 0l;

        for (float x = 1l; x <= 1000l; ++x){
            sum += x; //sum = sum + 1
        }
     //   System.out.println("Sum = " + sum);

        String[] colors = {"blue", "orange", "yellow", "red"};

        for (int x = 0; x < colors.length; ++x){
            System.out.println(colors[x]);
        }
    }
}
