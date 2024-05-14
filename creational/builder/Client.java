package creational.builder;

public class Client {

    public static void main(String[] args) {
        House house1 = new HouseBuilder()
                .setStories("2")
                .setDoorType("Wooden")
                .setRoofType("Concrete")
                .build();

        house1.printHouse();

        House house2 = new HouseBuilder().build();

        house2.printHouse();
    }
}
