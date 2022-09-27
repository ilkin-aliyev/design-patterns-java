package abstract_factory.website;

import abstract_factory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual Tester test code");
    }
}
