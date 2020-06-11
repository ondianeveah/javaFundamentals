package enums;

public class Main {
    public static void main(String[] args) {

        Test test = new Test(Size.MEDIUM);
        test.orderShirt();

        System.out.println("The size of the pizza is "
                + Size.EXTRALARGE.getSize() + ".");

        Size size = Size.EXTRALARGE;
        System.out.println(size.getSize());

        System.out.println(Size.MEDIUM);
        System.out.println(Size.EXTRALARGE);

        Size shirtSize;
        shirtSize = Size.SMALL;
        shirtSize = Size.MEDIUM;
        shirtSize = Size.LARGE;
        shirtSize = Size.EXTRALARGE;

        System.out.println(shirtSize);
    }
}
