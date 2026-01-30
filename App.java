public class App {
    public static void main(String[] args) {
        DatabaseConnectionManager manager1 = DatabaseConnectionManager.getInstance();
        DatabaseConnectionManager manager2 = DatabaseConnectionManager.getInstance();

        manager1.getConnection();
        manager2.getConnection();

        // Check if both references are same
        System.out.println(manager1 == manager2); // true
    }
}
