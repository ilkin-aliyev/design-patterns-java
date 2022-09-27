package prototype;

public class ProjectFactory {
    private final Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public Project cloneProject() {
        return (Project) project.copy();
    }
}
