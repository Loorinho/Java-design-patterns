package creational.builder;

public class HouseBuilder {

    public String stories;
    public String doorType;

    public HouseBuilder() {
    }

    public String roofType;
    public HouseBuilder setStories(String stories) {
        this.stories = stories;
        return this;
    }

    public HouseBuilder setDoorType(String doorType) {
        this.doorType = doorType;
        return this;
    }

    public HouseBuilder setRoofType(String roofType) {
        this.roofType = roofType;
        return this;
    }

    public House build() {
        return new House(this);
    }

}
