package reflections;

public interface Animal {
     void display();
}

interface Mammal{
     void makeSound();
}

class Dog implements Animal, Mammal{

    @Override
    public void display() {
        System.out.println("I am a dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Bark Bark");
    }
}
