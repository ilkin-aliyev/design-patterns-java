package factory;

public class BCryptPasswordManager implements PasswordManager{
    @Override
    public String encode(String plainText) {
        return "Encoded by BCrypt password manager";
    }

    @Override
    public String decode(String cipher) {
        return "Encoded by BCrypt password manager";
    }
}
