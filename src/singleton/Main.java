package singleton;

public class Main {
    public static void main(String[] args) {
        var dbConnection = DbConnection.getDbConnection();
        dbConnection.addQuery("First query");
        dbConnection.addQuery("Second query");
        dbConnection.showQueries();
        System.out.println("Test Ingress");
        System.out.println("One more line");
    }
}
