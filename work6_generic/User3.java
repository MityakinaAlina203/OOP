
import java.util.Objects;

public class User3 {
    private static String login;
    private static String password;

    public static class Query {
        private String login;
        private String password;

        public Query() {
            this.login = User3.login;
            this.password = User3.password;
        }

        public void printToLog() {
            System.out.printf("User with login %s and password %s sent query\n", login, password);
        }
    }

    public static void initialize(String login, String password) {
        User3.login = login;
        User3.password = password;
    }

    public static void main(String[] args) {
        initialize("789402556", "25478");
        User3.Query query1 = new User3.Query();
        query1.printToLog();

    }
}