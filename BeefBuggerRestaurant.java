public class BeefBuggerRestaurant extends Restaurant{

   @Override
   public Burger createBurger() {
     return new BeefBurger();
   }
   
}
