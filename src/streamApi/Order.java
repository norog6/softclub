package streamApi;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Order  {
    private int orderId;
    private LocalDate orderDate;
    private List<Product> products;

    Order(int orderId, LocalDate orderDate, List<Product> products) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.products = products;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderDate='" + orderDate + '\'' +
                ", products=" + products +
                '}';
    }
}
