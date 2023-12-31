package prototype;

public class File  implements Drive{
    private final String name;
    private final int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public Object downloadFileCopy() {
        return new File(name, size);
    }
}
