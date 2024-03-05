public abstract class Restaurant {

   public Burger orderBurger(){
      Burger p = createBurger();
      p.prepare();

      return p;
   }

   public abstract Burger createBurger();
   
}
