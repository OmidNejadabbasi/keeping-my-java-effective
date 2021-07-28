package item02.carbuilder;

public class Car {

    private String name;
    private CarType type;
    private String manufacturer;
    private double fuel;
    private int seats;
    private Transmission transmision;

    public Car(String name, CarType type, String manufacturer, double fuel, int seats, Transmission transmision) {
        this.name = name;
        this.type = type;
        this.manufacturer = manufacturer;
        this.fuel = fuel;
        this.seats = seats;
        this.transmision = transmision;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Transmission getTransmision() {
        return transmision;
    }

    public void setTransmision(Transmission transmision) {
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", manufacturer='" + manufacturer + '\'' +
                ", fuel=" + fuel +
                ", seats=" + seats +
                ", transmision=" + transmision +
                '}';
    }
}
