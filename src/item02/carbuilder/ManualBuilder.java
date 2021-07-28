package item02.carbuilder;

public class ManualBuilder implements Builder{
    private String name;
    private CarType type;
    private String manufacturer;
    private double fuel;
    private int seats;
    private Transmission transmision;


    @Override
    public void name(String name) {
        this.name = name;
    }

    @Override
    public void carType(CarType carType) {
        this.type = carType;
    }

    @Override
    public void manufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void fuel(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public void seats(int seats) {
        this.seats = seats;
    }

    @Override
    public void transmission(Transmission transmission) {
        this.transmision = transmission;
    }

    public String getResult() {
        return
                "name='" + name + '\'' +
                ", type=" + type +
                ", manufacturer='" + manufacturer + '\'' +
                ", fuel=" + fuel +
                ", seats=" + seats +
                ", transmision=" + transmision ;
    }
}
