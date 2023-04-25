package abstractFactory;

import abstractFactory.Samsung.SamsungFactory;

public class SamsungApp {
    public static void main(String[] args) {
        var factory = new SamsungFactory();
        var camera = factory.getCamera();
        var cpu = factory.getCpu();

        System.out.println(camera.takePicture());
        System.out.println(cpu.doCalculation());
    }
}
