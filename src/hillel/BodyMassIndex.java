package hillel;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        System.out.println("Input your mass, kg: ");
        int mass = m.nextInt();
        System.out.println("Input your height, m (format ##,##): ");
        float height = m.nextFloat();
        System.out.println("mass: " + mass +", height: " + height);
        float index = mass/(height * height);
        // format for index output
        DecimalFormat myFormatter = new DecimalFormat("##.##");
        String output = myFormatter.format(index);

        if (index <= 18.4) {
            String result = "Underweight";
            System.out.println("Your body mass index is: " + output + " - " + result);
        } else if (index >=18.5 && index < 24.9) {
            String result = "Normal";
            System.out.println("Your body mass index is: " + output + " - " + result);
        } else if(index >= 25.0) {
            String result = "Overweight";
            System.out.println("Your body mass index is: " + output + " - " + result);
        } else {
            System.out.println("Smth went wrong");
        }
//        Underweight (Mild thinness)	<18.4
//        Normal range	18.5 – 24.9
//        Overweight (Pre-obese)	≥25.0 – 29.9

    }
}
