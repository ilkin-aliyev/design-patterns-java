package factory;

public class FactoryMain {
    public static void main(String[] args) throws Exception{
        var passwordManagerFactory = createPasswordManagerFactory(PasswordManagerType.NoOpPasswordEncoder);
        var passwordManager = passwordManagerFactory.createPasswordManager();

        System.out.println(passwordManager.encode(""));
        System.out.println(passwordManager.decode(""));
    }

    private static PasswordManagerFactory createPasswordManagerFactory(PasswordManagerType type) throws Exception {
        return switch (type) {
            case BCrypt -> new BcryptPasswordManagerFactory();
            case SCrypt -> new SCryptPasswordManagerFactory();
            case NoOpPasswordEncoder -> new NoOpPasswordEncoderFactory();
            default -> throw new Exception("Type not found");
        };
    }
}
