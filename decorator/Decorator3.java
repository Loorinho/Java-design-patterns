public class Decorator3 implements ICalculator {
   private ICalculator cc;

   public Decorator3(ICalculator ic){
      cc = ic;
   }
   @Override
   public int add(int a, int b) {
      System.out.println("Inside decorator 3");
      // System.out.println("Inside decorator 3");

      return cc.add(a, b);
   }
   
}
