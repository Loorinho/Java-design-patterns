package creational.builder;

public class Director {

    private HouseBuilder builder;
    public Director(HouseBuilder hb){
        this.builder = hb;
    }

    public House buildOneStoryHouse(){
        return builder.setStories("1")
                .setDoorType("Wooden")
                .setRoofType("Pointed")
                .build();
    }
    public House buildTwoStoryHouse(){
        return builder.setStories("2")
                .setDoorType("Metallic and Double")
                .setRoofType("Flat")
                .build();
    }
}
