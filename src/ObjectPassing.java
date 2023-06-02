public class ObjectPassing {
    public static void main(String[] args) {
        ObjectGarage objectGarage = new ObjectGarage();

        ObjectCar objectCar1 = new ObjectCar("BMW");
        ObjectCar objectCar2 = new ObjectCar("Tesla");

        ObjectGarage.park(objectCar1);
        ObjectGarage.park(objectCar2);
    }
}
