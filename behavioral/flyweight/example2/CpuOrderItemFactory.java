package behavioral.flyweight.example2;



public class CpuOrderItemFactory {


    public static OrderItem createCpuOrderItem(CPUSeriesEnum series, int quantity) {
        Product product = CpuProductFlyweightFactory.createProduct("Hello", "sample", ProductTypeEnum.CPU);
        return new OrderItem(product, quantity);
    }
}
