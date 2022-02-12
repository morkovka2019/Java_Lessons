import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input something: ");
//        String string = s.nextLine();
//        System.out.println("Yours input is: " + string);
        int x = s.nextInt();
        System.out.println("Your number is: " + x);
    }
}
