public class Objects {
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String Color = "blue";
    double price = 50000.00;
    String Car;

    void drive() {
        System.out.println("You drive the car");
    }
    void brake() {
        System.out.println("You step on the break");
    }public static void main (String[] args) {
        Objects myCar = new Objects();

        System.out.println(myCar.make);
        System.out.println(myCar.model);

        myCar.brake();
    }
}
