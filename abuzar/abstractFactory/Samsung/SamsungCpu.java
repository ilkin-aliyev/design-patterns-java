package abstractFactory.Samsung;

import abstractFactory.CentralProcessingUnit;

public class SamsungCpu implements CentralProcessingUnit {
    @Override
    public String doCalculation() {
        return "Doing calculations as Samsung CPU";
    }
}
