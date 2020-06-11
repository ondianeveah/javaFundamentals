package stack.pushMethod;

import java.util.Stack;

//To add an element to the top of the stack, we use the push() method.
public class Main {

    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);
    }

}
