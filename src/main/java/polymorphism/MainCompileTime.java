package polymorphism;

public class MainCompileTime {
    public static void main(String[] args) {
        CompileTimePolymorphism compileTimePolymorphism = new CompileTimePolymorphism();
        compileTimePolymorphism.displayPattern();
        System.out.println("\n");
        compileTimePolymorphism.displayPattern('#');
    }
}
