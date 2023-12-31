package prototype;

public class FileFactory {
    private final File file;

    public FileFactory(File file) {
        this.file = file;
    }

    public File getFileCopy() {
        return (File) this.file.downloadFileCopy();
    }
}
