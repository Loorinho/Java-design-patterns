public class Product implements Component {
   int price;
   public Product(int p){
      this.price = p;
   }

   @Override
   public int getPrice() {
      return this.price; 
   }
   
}
