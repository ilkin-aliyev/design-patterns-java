package abstractFactory;

import abstractFactory.Apple.AppleFactory;

public class IphoneApp {
    public static void main(String[] args) {
        var appleFactory = new AppleFactory();
        var camera = appleFactory.getCamera();
        var cpu = appleFactory.getCpu();

        System.out.println(camera.takePicture());
        System.out.println(cpu.doCalculation());
    }
}
