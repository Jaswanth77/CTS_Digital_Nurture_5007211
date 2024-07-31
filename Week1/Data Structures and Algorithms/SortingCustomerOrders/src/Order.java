public class Order {

    int orderId;
    String customerName;
    double totalPrice;

    public Order(int orderId,String customerName,double totalPrice)
    {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public int getOrderId()
    {
        return this.orderId;
    }

    public String getCustomerName()
    {
        return this.customerName;
    }

    public double getTotalPrice()
    {
        return this.totalPrice;
    }

    public String toString()
    {
        return "Order (orderId=" + orderId + ", customerName=" + customerName + ", totalPrice=" + totalPrice + ")";
    }
}
