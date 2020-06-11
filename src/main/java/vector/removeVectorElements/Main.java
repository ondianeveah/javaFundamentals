package vector.removeVectorElements;

import java.util.Vector;



/*set()	= changes an element of the vector
size() = returns the size of the vector
toArray() = converts the vector into an array
toString() = converts the vector into a String
contains() = searches the vector for specified element and returns a boolean result
* */

public class Main {

    public static void main(String[] args) {
        Vector<String> animals= new Vector<>();
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

        System.out.println("Initial Vector: " + animals);

        // Using remove()
        String element = animals.remove(1);
        System.out.println("Removed Element: " + element);
        System.out.println("New Vector: " + animals);

        // Using clear()
        animals.clear();
        System.out.println("Vector after clear(): " + animals);
    }
}
