package singleton;

public class SingletonClass {
    private static SingletonClass instance;
    private static String property;

    public static SingletonClass getInstance() {
        if(instance == null)
            instance = new SingletonClass();

        return instance;
    }

    private SingletonClass () {}

    public void setProperty(String arg) {
        property = arg;
    }

    public String getProperty() {
        return property;
    }
}
