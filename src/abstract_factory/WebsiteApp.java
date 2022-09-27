package abstract_factory;

import abstract_factory.website.WebsiteTeamFactory;

public class WebsiteApp {
    public static void main(String[] args) {
        var projectTeamFactory = new WebsiteTeamFactory();
        var developer = projectTeamFactory.getDeveloper();
        var tester = projectTeamFactory.getTester();
        var po = projectTeamFactory.getProductOwner();

        System.out.println("Build website");
        developer.writeCode();
        tester.testCode();
        po.manageProduct();
    }
}
