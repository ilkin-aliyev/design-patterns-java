package abstract_factory.banking;

import abstract_factory.ProductOwner;

public class BankingPO implements ProductOwner {
    @Override
    public void manageProduct() {
        System.out.println("Banking PO manage product");
    }
}
