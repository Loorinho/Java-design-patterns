package creational.prototype;

public class Car implements Prototype{

    private String model;
    private String color;
    private int price;

    public Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public Car(Car car) {
        /**
         * This is a copy constructor. It is used to create a new object by copying the state of an existing object.
         * It will copy the values of all the fields defined in the class from the past object into the newly created instance
         * Note that if the created instance extends another class, the super() method should be called to copy the parent class
         * fields(or let the parent class' constructor to let the super class handle the cloning of its private fields)
         */
//        super(car);
        this.model = car.model;
        this.color = car.color;
        this.price = car.price;
    }
    @Override
    public Car clone() {
        // This is just one line. We are just invoking the new() operator with the prototypical version of the constructor
        // we've just created
        return new Car(this);
    }
}
