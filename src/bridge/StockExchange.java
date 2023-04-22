package bridge;

public class StockExchange extends Application {
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developApplication() {
        System.out.println("Stock Exchange in progress");
        getDeveloper().writeCode();
    }
}
