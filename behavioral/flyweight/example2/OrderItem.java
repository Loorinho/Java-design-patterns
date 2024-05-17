package behavioral.flyweight.example2;

public class OrderItem {
   public Product product; // This is the flyweight object - it is storing the intrinsic state
    public int quantity; // This is the extrinsic state - it is the one which keeps changing
    public OrderItem(Product _product, int _quantity) {
        this.product = _product;
        this.quantity = _quantity;
    }
}
