package abstract_factory.website;

import abstract_factory.Developer;

public class PythonDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Python developer write code");
    }
}
