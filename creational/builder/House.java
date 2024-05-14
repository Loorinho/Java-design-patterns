package creational.builder;

public class House {
    private String stories;
    private String doorType;
    private String roofType;

    House(HouseBuilder houseBuilder) {
        this.stories = houseBuilder.stories;
        this.doorType = houseBuilder.doorType;
        this.roofType = houseBuilder.roofType;
    }

    public void printHouse() {
        System.out.println("House with " + stories + " stories, " + doorType + " door and " + roofType + " roof.");
    }
}
