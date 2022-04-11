package patterns.command;

public class Demo {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Broker broker = new Broker();
        broker.takeOrder(new BuyStock(stock));
        broker.takeOrder(new BuyStock(stock));
        broker.takeOrder(new SellStock(stock));

        broker.placeOrders();
    }
}
