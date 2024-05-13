package structural.facade;

public class Facade {
    ThirdPartyLibrary thirdPartyLibrary = new ThirdPartyLibrary();
    public void makePayment(String email){
        // In this method we are calling things from the third party library in their specific order. Client wont have to call these, it
        // is all done in the Facade class. Client will only call the make payment method and we move
        System.out.println("Hello client. You have started your communication with the third party library");
        thirdPartyLibrary.getEmail(email);
        thirdPartyLibrary.getBalance();
        thirdPartyLibrary.verifyBalance();
        System.out.println("Communication with third party done");
    }
}
