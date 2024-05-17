package behavioral.flyweight.example2;

public class Product {
     public String name;
     public String description;
     public ProductTypeEnum productType;

     public Product(String name, String description, ProductTypeEnum productType) {
          this.name = name;
          this.description = description;
          this.productType = productType;
     }
}
