package hillel;

public class Main {
    public static void main(String[] args){
        User myUser = new User("log21", "pass", UserTypes.AUTHORIZED);
        User AdminFirst = new User("superAdmin", "passPass", UserTypes.ADMIN);
        User AdminSecond = new User("superAdmin", "passPass", UserTypes.ADMIN);

        System.out.println(myUser.toString());
        System.out.println("Your priority is: " + AdminFirst.hashCode());
        System.out.println("Your priority is: " + myUser.hashCode());
        System.out.println(AdminFirst.equals(AdminSecond));
        System.out.println(AdminFirst.equals(myUser));
    }
}
