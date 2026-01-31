public class User {

    // mandatory fields
    private final String username;
    private final String password;

    // optional fields
    private final String email;
    private final String phone;

    // private constructor
    private User(Builder builder) {
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    // static inner Builder class
    public static class Builder {

        // mandatory
        private final String username;
        private final String password;

        // optional
        private String email;
        private String phone;

        public Builder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {

            // production-level validation
            if (username == null || password == null) {
                throw new IllegalStateException("Username and password are required");
            }

            return new User(this);
        }
    }
    public static void main(String[] args) {
        User user = new User.Builder("john", "1234")
    .email("john@mail.com")
    .phone("99999")
    .build();

    }
}
