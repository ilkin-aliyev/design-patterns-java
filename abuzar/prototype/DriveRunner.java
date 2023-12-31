package prototype;

public class DriveRunner {
    public static void main(String[] args) {
        var file = new File("first", 200);
        var fileFactory = new FileFactory(file);
        var secondFile = fileFactory.getFileCopy();

        System.out.println(file);
        System.out.println(secondFile);
    }
}
