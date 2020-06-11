package generics.genericClass;

public class Main {
    public static void main(String[] args) {
        GenericsClass<String> intObj = new GenericsClass<>("Greetings!");
        System.out.println("Generic Class returns: " + intObj.getData());

        //Initialize generic class with String data
        GenericsClass<String> stringObj = new GenericsClass<>( intObj.getData() + " is in Java Programming");
        System.out.println("Generic class returns: " + stringObj.getData());
    }
}
