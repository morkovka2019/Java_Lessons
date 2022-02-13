package hillel.homework_10;
import hillel.StringsFormater;
import java.io.*;


public class Formatter {
    public static String readFromFile( String path ) {
        String text = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String textFromFile;
            StringBuilder builder = new StringBuilder();
            while ((textFromFile = reader.readLine()) != null) {
                builder.append(textFromFile);
            }
            text = builder.toString();
//            System.out.println(text);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR!!! InputText.txt is not found!!!");
            e.printStackTrace();
            text = null;
        } catch (IOException e) {
            System.out.println("ERROR!!! Smth went wrong.");
            e.printStackTrace();
            text = null;
        }
        finally {
            System.out.println("Reading text is finished!");
        }
        return text;
    }
    public static void writeTextIntoFile(String text, String path) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            writer.write(text);
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR!!! OutputText.txt is not found!!!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("ERROR!!! Smth went wrong.");
            e.printStackTrace();
        }
        finally {

            System.out.println("Writing text is finished!");
        }
    }
    public static void main (String[] args) throws FileNotFoundException {
        String pathInput = "./src/hillel/homework_10/resources/InputText.txt";
        String pathOutput = "./src/hillel/homework_10/resources/OutputText.txt";
        String textForFormat = readFromFile(pathInput);
        writeTextIntoFile(StringsFormater.formatText(textForFormat), pathOutput);

    }
}
