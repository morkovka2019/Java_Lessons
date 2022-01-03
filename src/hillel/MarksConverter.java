package hillel;

import java.util.Scanner;

public class MarksConverter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input your mark: ");
        if (!inp.hasNextInt()){
            System.out.println("Your value is not applicable. Please input value in range 1-12.");
        } else {
            int mark = inp.nextInt();
            switch (mark) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Your mark is: 2");
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println("Your mark is: 3");
                    break;
                case 7:
                case 8:
                case 9:
                    System.out.println("Your mark is: 4");
                    break;
                case 10:
                case 11:
                case 12:
                    System.out.println("Your mark is: 5");
                    break;
                default:
                    System.out.println("Your value is out of range. Please input value in range 1 - 12.");
            }
        }
    }
}
