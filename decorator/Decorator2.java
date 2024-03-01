public class Decorator2 implements ICalculator {

   private ICalculator cc;

   public Decorator2(ICalculator c){
      cc = c;
   }

   @Override
   public int add(int a, int b) {
      System.out.println("start of decorator 2 decorating");
      System.out.println("The inputs are " +a+ " and " +b);
      return cc.add(a,b);

   
   }
   
}
