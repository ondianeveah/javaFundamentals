package generics.boundedTypes;

public class GenericsClass<T extends Number> {
    public void display() {
        System.out.println("This is a bounded type generics class.");
    }
}
