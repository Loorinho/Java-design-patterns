
// This is the basic implementation of the calculator. It defines the basic behavior that can be altered by the decorators
public class Decorator1 implements ICalculator{

   @Override
   public int add(int a, int b) {
      return a +b;
   }
   
}
