package Composite;

public class Client {

   public static void main(String[] args) {
      // Client client = new Client();

      ConcreteComponent c1 = new ConcreteComponent(); 
      ConcreteComponent2 c2 = new ConcreteComponent2(); 

      ConcreteComposite cc = new ConcreteComposite();
      cc.addComponent(c1);
      cc.addComponent(c2);


      cc.method();

   }
   
}
