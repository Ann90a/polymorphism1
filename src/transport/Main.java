package transport;

import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int counter = 1;

        Car car1 = generateCar(counter++);
        Car car2 = generateCar(counter++);
        Car car3 = generateCar(counter++);
        Car car4 = generateCar(counter++);

        Bus bus1 = generateBus(counter++);
        Bus bus2 = generateBus(counter++);
        Bus bus3 = generateBus(counter++);
        Bus bus4 = generateBus(counter++);

        Truck truck1 = generateTruck(counter++);
        Truck truck2 = generateTruck(counter++);
        Truck truck3 = generateTruck(counter++);
        Truck truck4 = generateTruck(counter++);

        DriverB ivan = new DriverB("Иван", true, 6);
        DriverC petr = new DriverC("Петр", true, 9);
        DriverD vasya = new DriverD("Василий", false, 2);

        ivan.startMove(car1);
        ivan.stopMove(car1);
        ivan.refill(car1);
        ivan.printInfo(car1);

        petr.startMove(truck2);
        petr.stopMove(truck2);
        petr.refill(truck2);
        petr.printInfo(truck2);

        vasya.startMove(bus3);
        vasya.stopMove(bus3);
        vasya.refill(bus3);
        vasya.printInfo(bus3);
    }

    private static Car generateCar(int number) {
        return new Car("марка №" + number, "модель №" + number, 1.6);
    }

    private static Bus generateBus(int number) {
        return new Bus("марка №" + number, "модель №" + number, 2.6);
    }

    private static Truck generateTruck(int number) {
        return new Truck("марка №" + number, "модель №" + number, 3.5);
    }


}