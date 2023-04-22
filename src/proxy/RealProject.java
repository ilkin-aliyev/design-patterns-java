package proxy;

public class RealProject implements Project {
    private final String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    @Override
    public void run() {
        System.out.println("Running " + url + " project");
    }

    public void load() {
        System.out.println("Loading " + url + " project");
    }
}
