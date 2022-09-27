package singleton;

public class DbConnection {
    private static DbConnection dbConnection;
    private static String queryHistory = "Query history:\n";

    public static DbConnection getDbConnection() {
        if (dbConnection == null) dbConnection = new DbConnection();
        return dbConnection;
    }

    private DbConnection() {
    }

    public void addQuery(String query) {
        queryHistory += query + "\n";
    }

    public void showQueries() {
        System.out.println(queryHistory);
    }
}
