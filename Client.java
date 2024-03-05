public class Client {
   public static void main(String[] args) {
      Restaurant b1 = new BeefBuggerRestaurant();
      Burger beef = b1.orderBurger(); // ordering the beef burger

       Restaurant v1 = new VeggieBurgerRestaurant();
      Burger veggie = v1.orderBurger();  // ordering the beef burger

   }
}
