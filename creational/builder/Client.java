package creational.builder;

public class Client {

    public static void main(String[] args) {

        // creating a house builder instance
        HouseBuilder houseBuilder = new HouseBuilder();
        //
        // Passing the house builder into the director's constructor
        Director director = new Director(houseBuilder);
        House house1 = director.buildOneStoryHouse();
        House house2 = director.buildTwoStoryHouse();

        house1.printHouse();
        house2.printHouse();
    }
}
