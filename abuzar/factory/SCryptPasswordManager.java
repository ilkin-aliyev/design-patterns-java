package factory;

public class SCryptPasswordManager implements PasswordManager{
    @Override
    public String encode(String plainText) {
        return "Encoded by SCrypt password manager";
    }

    @Override
    public String decode(String cipher) {
        return "Decoded by SCrypt password manager";
    }
}
