package polymorphism;

//can be achieved through method overriding
public class RunTimePolymorphism {

    abstract class Animal{
        public abstract void makeNoise();
    }

    public class Dog extends Animal{
        @Override
        public void makeNoise() {
            System.out.println("Bark bark.. ");
        }
    }

    class Cow extends Animal{
        @Override
        public void makeNoise() {
            System.out.println("Moo moo.. ");
        }
    }
}
