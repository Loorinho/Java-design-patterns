public class Client {

   public static void main(String[] args) {
      // Client c = new Client();

      ICalculator cd = new Decorator2(new Decorator2(new Decorator3(new Decorator1())));

      int a  = cd.add(4, 6);
      System.out.println(a);

      // System.out.println("Hi there");
   }
   
}
