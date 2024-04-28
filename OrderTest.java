public class OrderTest {

    public static void main(String[] args) {

        Order order = new OrderAction();
        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        // These methods might not be needed for all orders
        Invoice generate = new OrderAction();
        generate.generateInvoice("order_123.pdf");

        Email send = new emailNotificationSender();
        send.sendEmailNotification("johndoe@example.com");
    }
}