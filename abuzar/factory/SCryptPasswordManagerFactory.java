package factory;

public class SCryptPasswordManagerFactory implements PasswordManagerFactory{
    @Override
    public PasswordManager createPasswordManager() {
        return new SCryptPasswordManager();
    }
}
