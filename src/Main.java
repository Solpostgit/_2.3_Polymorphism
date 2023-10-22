public class Main {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle("bicycle1", 2);

        Car car = new Car("Audi", 4);

        Truck truck = new Truck("ГАЗ", 6);


        ServiceStation serviceStation = new ServiceStation();

        serviceStation.check(bicycle);

        serviceStation.check(car);

        serviceStation.check(truck);

    }
}