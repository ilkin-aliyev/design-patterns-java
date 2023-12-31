package factory;

public class NoOpPasswordEncoderFactory implements PasswordManagerFactory{
    @Override
    public PasswordManager createPasswordManager() {
        return new NoOpPasswordEncoder();
    }
}
