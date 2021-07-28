package item02.carbuilder;

public class Main {

    public static void main(String[] args) {



        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);
        System.out.println(carBuilder.getResult());
        director.constructVan(carBuilder);
        System.out.println(carBuilder.getResult());



    }
}
