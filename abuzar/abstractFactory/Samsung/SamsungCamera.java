package abstractFactory.Samsung;

import abstractFactory.Camera;

public class SamsungCamera implements Camera {
    @Override
    public String takePicture() {
        return "Took picture using Samsung camera";
    }
}
