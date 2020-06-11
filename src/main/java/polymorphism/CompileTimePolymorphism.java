package polymorphism;

//achieved through method overloading and operator overloading
public class CompileTimePolymorphism {

    public void displayPattern(){
        int a = 20;
        int b = 55;
        int sum = a + b;
        for(int i = 0; i < 10; i++) {
            sum += sum;
            System.out.print(sum + ", ");
        }
    }

    public void displayPattern(char symbol) {
        for(int i = 0; i < 10; i++) {
            System.out.print(symbol);
        }
    }
}

