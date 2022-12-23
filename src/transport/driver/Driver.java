package transport.driver;

import transport.Transport;

public abstract class Driver<T extends Transport> {

    private final String name;
    private boolean hasDriverLicense;
    private int experience;

    public Driver(String name, boolean hasDriverLicense, int experience) {
        this.name = name;
        this.hasDriverLicense = hasDriverLicense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMove(T transport);

    public abstract void stopMove(T transport);

    public abstract void refill(T transport);

    public void printInfo(T transport) {
        System.out.println("Водитель " + name + " управляет автомобилем " + transport.getBrand() +
                " и будет учавствовать в заезеде");

    }

}
