package methodOveride;

import instanceOf.InstanceOfInheritance;

public class MethodOverriding {
    public static void main(String[] args) {
        InstanceOfInheritance.Dog dog1 = new InstanceOfInheritance.Dog();
        dog1.printMessage();
        //Access Superclass Attribute
        dog1.printType();

    }
}
