package hillel;

public class Main {

    public static void main(String[] args){
        User myUser0 = new User("logAuto0", "passAuto0", UserTypes.AUTHORIZED);
        User AdminFirst = new User("superAdmin1", "passPass1", UserTypes.ADMIN);
        User AdminSecond = new User("superAdmin2", "passPass2", UserTypes.ADMIN);

        System.out.println(AdminFirst.toString());
        System.out.println("Your ID is: " + myUser0.hashCode());
        System.out.println("Your ID is: " + AdminSecond.hashCode());
        System.out.println(AdminFirst.equals(AdminSecond));
        System.out.println(AdminFirst.equals(AdminFirst));

    }
}
