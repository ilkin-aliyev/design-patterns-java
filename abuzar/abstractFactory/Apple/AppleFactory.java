package abstractFactory.Apple;

import abstractFactory.Camera;
import abstractFactory.CentralProcessingUnit;
import abstractFactory.PhoneFactory;

public class AppleFactory implements PhoneFactory {
    @Override
    public Camera getCamera() {
        return new AppleCamera();
    }

    @Override
    public CentralProcessingUnit getCpu() {
        return new AppleCpu();
    }
}
