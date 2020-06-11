package generics.genericMethod;

public class Main {
    public static void main(String[] args) {

        // initialize the class with Integer data
        DemoClass demo = new DemoClass();
        demo.<String>genericsMethod("Java Programming");
    }
}

class DemoClass {

    // generics method
    public <T> void genericsMethod(T data) {
        System.out.println("This is a generics method.");
        System.out.println("The data passed to method is " + data);
    }
}
