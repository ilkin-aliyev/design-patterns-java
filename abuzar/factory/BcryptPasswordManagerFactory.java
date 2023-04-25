package factory;

public class BcryptPasswordManagerFactory implements PasswordManagerFactory{
    @Override
    public PasswordManager createPasswordManager() {
        return new BCryptPasswordManager();
    }
}
