import java.util.Objects;

class User2 {
    private String login;
    private String password;

    public User2 (String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User2 user = (User2) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    public void createQuery() {
        class Query {
            public void printToLog() {
                System.out.println("Пользователь с логином " + login + " и паролем " + password + " отправил запрос");
            }
        }

        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        User user = new User("123456", "7894561");
        user.setLogin("exampleLogin");
        user.setPassword("examplePassword");

        user.createQuery();


    }
}