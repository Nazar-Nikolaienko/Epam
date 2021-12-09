import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConWords {
    public static String[] con(String path, boolean onToLower){
        try {
            FileInputStream input = new FileInputStream(path);
            Scanner scanner = new Scanner(input);
            String data = "";
            while (scanner.hasNext()) {
                data += scanner.next() + " ";
            }
            data = data.replaceAll("[^a-zA-Z0-9]", " ");

            String[] words = data.split("\s\s*");
            if (onToLower) {
                LowerAll(words);
            }
            return words;
        } catch (FileNotFoundException ex) {
            return new String[0];
        }
    }

    private static void LowerAll(String[] words) {
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }
    }

}