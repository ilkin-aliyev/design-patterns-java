package bridge;

public class ApplicationCreator {
    public static void main(String[] args) {
        Application[] applications = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new KotlinDeveloper())
        };

        for (Application application : applications) {
            application.developApplication();
        }
    }
}
