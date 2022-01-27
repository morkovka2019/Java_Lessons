package hillel;

import java.sql.SQLOutput;

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
        return ("User has type: "+ this.type + ", and has priority: " + this.type.getPriority());
    };
    public boolean equals(Object obj) {
        if(!(obj instanceof User)) return false;
        User a = (User) obj;
        return this.type.equals(a.type);
    }
    public int hashCode() {
        return type.ordinal();
    }


}
