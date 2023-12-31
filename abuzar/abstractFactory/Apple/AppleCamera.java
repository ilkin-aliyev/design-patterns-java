package abstractFactory.Apple;

import abstractFactory.Camera;

public class AppleCamera implements Camera {
    @Override
    public String takePicture() {
        return "Took picture using iphone camera";
    }
}
