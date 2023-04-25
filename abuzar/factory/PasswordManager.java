package factory;

public interface PasswordManager {
    String encode(String plainText);
    String decode(String cipher);
}
