package vector;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> reptiles = new Vector<>();

        // Using the add() method
        reptiles.add("Crocodile");
        reptiles.add("Alligator");

        // Using index number
        reptiles.add(2, "Snake");
        System.out.println("Vector: " + reptiles);

        // Using addAll()
        Vector<String> animals = new Vector<>();
        animals.add("Comodo Dragon");

        animals.addAll(reptiles);
        System.out.println("New Vector: " + animals);
    }
}

