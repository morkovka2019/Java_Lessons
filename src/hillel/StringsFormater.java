package hillel;
import java.util.Scanner;

public class StringsFormater {
    public static String formatText(String text) {
        String [] splitted = text.split(" ");
        String firstWord = splitted[0].substring(0, 1).toUpperCase() + splitted[0].substring(1);
        splitted[0] = firstWord;
        for(int i = 0; i < splitted.length; i++){
            if(splitted[i].contains(".")){
                if(i+1 < splitted.length) {
                    splitted[i + 1] = splitted[i + 1].substring(0, 1).toUpperCase() + splitted[i + 1].substring(1);
                }
            }
        }
        String joined = String.join(" ", splitted);
        return joined;
    };

    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input your string: ");
            String myText = inp.nextLine();
            System.out.println(formatText(myText));
    }
}
