package structural.facade;

public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.makePayment("romeojacoson@gmail.com");
        /**
         * This way we can just reuse these two lines of code anywhere else in our code with little to no hustle at all
         */
    }
}
