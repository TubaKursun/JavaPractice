package Constructor;

public class CarTest {

    public static void main(String[] args) {

        Car C1 = new Car("Kia");
        Car C2 = new Car("Kia");
        Car C3 = new Car("Kia");

        Car C5 = new Car("Lexus");
        Car C6 = new Car("Lexus");


        C1 = null;
        System.out.println(C3);
        System.gc();
    }
}
