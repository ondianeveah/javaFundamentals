package ifElse;

public class IfElseIfStatement {
    public static void main(String[] args) {
        double number = 0.0;

        if(number > 0){
            System.out.println("The number is positive.");
        }else if (number < 0){
            System.out.println("The number is negative.");
        }else {
            System.out.println("The number is 0.");
        }
    }
}
