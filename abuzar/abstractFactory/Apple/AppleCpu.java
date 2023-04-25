package abstractFactory.Apple;

import abstractFactory.CentralProcessingUnit;

public class AppleCpu implements CentralProcessingUnit {
    @Override
    public String doCalculation() {
        return "Doing calculations as Iphone CPU";
    }
}
