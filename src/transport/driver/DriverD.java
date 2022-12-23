package transport.driver;

import transport.Bus;
import transport.Truck;

public class DriverD extends Driver<Bus>{
    public DriverD(String name, boolean hasDriverLicense, int experience) {
        super(name, hasDriverLicense, experience);
    }

    @Override
    public void startMove(Bus transport) {
        transport.start();
    }

    @Override
    public void stopMove(Bus transport) {
        transport.stop();
    }

    @Override
    public void refill(Bus transport) {
        System.out.println("Водитель " + getName() + " заправляет автобус " + transport.getBrand());
    }
}
