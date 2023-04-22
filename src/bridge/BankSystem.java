package bridge;

public class BankSystem extends Application {
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developApplication() {
        System.out.println("Bank System in progress");
        getDeveloper().writeCode();
    }
}
