package behavioral.flyweight.example2;

import behavioral.flyweight.example1.Pen;

import java.util.HashMap;

public class CpuProductFlyweightFactory {

    private static final HashMap<String, Product> products = new HashMap<>();

    public static Product createProduct(String name, String description, ProductTypeEnum productType) {
        String key = productType.toString();

        Product product = products.get(key);
        if (product == null) {
            product = new Product(name, description, productType);
            products.put(key, product);
        }
        return product;

    }

//    public static CpuProduct createCpuProduct(CPUSeriesEnum series) {
//        return new CpuProduct(series);
//    }
}
