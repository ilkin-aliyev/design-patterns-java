package singleton;

public class SingletonMain {
    public static void main(String[] args) {
        var firstInstance = SingletonClass.getInstance();
        var secondInstance = SingletonClass.getInstance();

        firstInstance.setProperty("First");
        secondInstance.setProperty("Second");

        // Both should print second
        System.out.println(firstInstance.getProperty());
        System.out.println(secondInstance.getProperty());

        // Both hash codes must be equal
        System.out.println(firstInstance.hashCode());
        System.out.println(secondInstance.hashCode());
    }
}
