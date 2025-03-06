package Facade;

public class FacadeOrderBuilder {
    private InventoryManagment inventoryManagment;
    private ShippingManager shippingManager;
    private PaymentHandler paymentHandler;

    public FacadeOrderBuilder() {
        this.inventoryManagment = new InventoryManagment();
        this.shippingManager = new ShippingManager();
        this.paymentHandler =new PaymentHandler();
    }
    public void buildOrder(Order order) {
        inventoryManagment.handleStock();
        shippingManager.handleShip();
        paymentHandler.HandlePayment(order.getMyproducts(),order.getPaymentMethod());
    }
}
