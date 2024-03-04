import java.util.ArrayList;

public class Composite implements Component {

   public ArrayList<Component> children;

   public Composite(){
      this.children = new ArrayList<>();
      // children.
   }

   public void addChild(Component child){
      this.children.add(child);
   }

   @Override
   public int getPrice() {
     int totalPrice = 0;

     for (Component component : children) {
      int result = component.getPrice(); // getting the price of a component
      totalPrice = totalPrice + result;    // adding the total to the current total
     }

     return totalPrice; // returning the total price of the composite
   }
   
}
