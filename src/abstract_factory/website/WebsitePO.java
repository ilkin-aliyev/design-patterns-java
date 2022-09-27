package abstract_factory.website;

import abstract_factory.ProductOwner;

public class WebsitePO implements ProductOwner {
    @Override
    public void manageProduct() {
        System.out.println("Website PO manage product");
    }
}
