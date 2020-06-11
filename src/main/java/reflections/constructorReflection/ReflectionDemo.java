package reflections.constructorReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            Dog d1 = new Dog();
            Class obj = d1.getClass();

            // get all the constructors in a class using getDeclaredConstructor()
            Constructor[] constructors = obj.getDeclaredConstructors();

            for(Constructor c : constructors) {
                // get names of constructors
                System.out.println("Constructor Name: " + c.getName());

                // get access modifier of constructors
                int modifier = c.getModifiers();
                System.out.println("Modifier: " + Modifier.toString(modifier));

                // get the number of parameters in constructors
                System.out.println("Parameters: " + c.getParameterCount());
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
