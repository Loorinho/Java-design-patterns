public class Client {
   public static void main(String[] args) {

   Component child1 = new Product(200);
   Component child2 = new Product(250);
   Component child3 = new Product(700);
   Component child4 = new Product(900);

   System.out.println("Child1's price: USD "+child1.getPrice());

   Composite composite  = new Composite(); // creating the composite object
      composite.addChild(child2);
      composite.addChild(child3);
      composite.addChild(child4);

   System.out.println("Total price: USD "+composite.getPrice());

   }
}
