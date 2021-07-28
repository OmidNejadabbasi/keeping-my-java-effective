package item02.carbuilder;

public interface Builder {

    void name(String name);
    void carType(CarType carType);
    void manufacturer(String manufacturer);
    void fuel(double fuel);
    void seats(int seats);
    void transmission(Transmission transmission);

}
