package abstract_factory.website;

import abstract_factory.Developer;
import abstract_factory.ProductOwner;
import abstract_factory.ProjectTeamFactory;
import abstract_factory.Tester;
import abstract_factory.banking.BankingPO;
import abstract_factory.banking.JavaDeveloper;
import abstract_factory.banking.QATester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PythonDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProductOwner getProductOwner() {
        return new WebsitePO();
    }
}
