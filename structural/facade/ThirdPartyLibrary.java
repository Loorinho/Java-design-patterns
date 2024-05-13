package structural.facade;

public class ThirdPartyLibrary {

    public void getBalance(){
        System.out.println("Getting balance from third party");
    }
    public void getEmail(String email){
        System.out.println("Verifying the email " + email + " from paypal");
    }
    public void verifyBalance(){
        System.out.println("Verifying customer bank account balance from third party");
    }
}
