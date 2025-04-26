package com.example.design_patterns.Structural.Facade.OnlineShoppingSystem;

public class OnlineShoppingFacade {

    private InventoryService inventoryService;
    private PaymentService paymentService;
    private OrderService orderService;
    private UserService userService;

    public OnlineShoppingFacade() {
        inventoryService = new InventoryService();
        paymentService = new PaymentService();
        orderService = new OrderService();
        userService = new UserService();
    }

    public void placeOrder(String username, String password, String productId, int quantity, String paymentMethod) {
        userService.login(username, password);

        if (inventoryService.checkStock(productId)) {
            orderService.placeOrder(productId, quantity);

            double amount = 100.0 * quantity; // Assuming $100 per item for simplicity
            paymentService.processPayment(paymentMethod, amount);

            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Product is out of stock!");
        }
    }

    public void trackOrder(String orderId) {
        String trackingDetails = orderService.trackOrder(orderId);
        System.out.println(trackingDetails);
    }
}
