package authentication_application;

public class AuthMain {
    public static void main(String[] args) {
        System.out.println("Authentication App");
        AuthData authData = new AuthData();
        boolean flag = true;

        while (flag) {
            switch (authData.displayOption()) {
                case 1 -> {
                    authData.register();
                }
                case 2 -> authData.login();

                case 3 -> flag = false;
                default -> System.out.println("Invalid entry");
            }

        }
    }
}
