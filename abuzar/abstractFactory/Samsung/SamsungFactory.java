package abstractFactory.Samsung;

import abstractFactory.Camera;
import abstractFactory.CentralProcessingUnit;
import abstractFactory.PhoneFactory;

public class SamsungFactory implements PhoneFactory {
    @Override
    public Camera getCamera() {
        return new SamsungCamera();
    }

    @Override
    public CentralProcessingUnit getCpu() {
        return new SamsungCpu();
    }
}
