package factory;

public class NoOpPasswordEncoder implements PasswordManager{
    @Override
    public String encode(String plainText) {
        return "Do not use this in production:\n" + plainText;
    }

    @Override
    public String decode(String cipher) {
        return "Do not use this in production:\n" + cipher;
    }
}
