package item02.carbuilder;

public class Director {

    public void constructSportCar(Builder builder) {

        builder.carType(CarType.SPORTS_CAR);
        builder.seats(2);
        builder.manufacturer("Lamborghini");
        builder.fuel(50d);
        builder.transmission(Transmission.SEMI_AUTOMATIC);
        builder.name("Aventador");

    }

    public void constructVan(Builder builder){

        builder.carType(CarType.CITY_CAR);
        builder.seats(8);
        builder.fuel(80d);
        builder.transmission(Transmission.MANUAL);
        builder.name("");

    }

}
