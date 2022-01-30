package hillel;

public class User {
    private String login;
    private String password;
    UserTypes type;


    public User(String login, String password, UserTypes type) {
        this.login = login;
        this.password = password;
        this.type = type;
    };
    public String toString() {
        return ("\nLogin: "+ this.getLogin() + ", Password: " + this.password + ", User ID: " + this.hashCode() + "," +
                "\nUser has type: "+ this.type + ", and has priority: " + this.type.getPriority());
    };
    public boolean equals(Object obj) {
        if(!(obj instanceof User)) return false;
        User a = (User) obj;
        return this.login.equals(a.login) && this.password.equals(a.password) && this.type.equals(a.type);
    }
    public int hashCode() {
        return this.login.hashCode() + 7 * this.password.hashCode() + type.ordinal();
    }
    public String getLogin() {
        return this.login;
    }



}
