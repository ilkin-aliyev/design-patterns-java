package prototype;

public class Project implements VersionControlCommands {
    private final long id;
    private final String name;
    private final String sourceCode;

    public Project(long id, String name, String sourceCode) {
        this.id = id;
        this.name = name;
        this.sourceCode = sourceCode;
    }

    @Override
    public Object copy() {
        return new Project(id, name, sourceCode);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
