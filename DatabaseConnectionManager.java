public class DatabaseConnectionManager {

    // Single instance created eagerly (thread-safe)
    private static final DatabaseConnectionManager instance = new DatabaseConnectionManager();

    // Private constructor prevents external instantiation
    private DatabaseConnectionManager() {
        // Initialize connection pool here
        System.out.println("Database connection pool initialized");
    }

    // Public method to provide access to the singleton instance
    public static DatabaseConnectionManager getInstance() {
        return instance;
    }

    // Example method to get a database connection
    public void getConnection() {
        System.out.println("Returning a database connection from pool");
    }
}
