package hillel;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length for your array: ");
        int size = scanner.nextInt();
        double [] myArray = new double [size];
        Random random = new Random();
        double a = -50.00;
        double b = 50.00;
        for(int i = 0; i < size; i++){
            myArray[i] = a + random.nextDouble() * (b - a);
            System.out.printf("%.2f   ", myArray[i]);
        }
        double max = a - 1;
        for(int k = 0; k < size; k++){
            if(myArray[k] > max){
                max = myArray[k];
            }
        }
        System.out.println("\nMax value is: ");
        System.out.printf("%.2f ", max);

        double min = b + 1;
        for(int c = 0; c < size; c++){
            if(myArray[c] < min){
                min = myArray[c];
            }
        }
        System.out.println("\nMin value is: ");
        System.out.printf("%.2f ", min);

        double summ = 0;
        for(int j = 0; j < size; j++){
            summ = summ+ myArray[j];
        }
        double avg = (summ/size);

        System.out.println("\nAverage value is: ");
        System.out.printf("%.2f ", avg);
    }
}
