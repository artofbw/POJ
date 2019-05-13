package exercise04_06_07.filereader;

import exercise04_06_07.model.SampleText;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * pair programming:
 *
 * @author Rafał Sochacki s20047
 * @author Łukasz Cwikliński s19334
 * <p>
 * Class to read file from users desktop and to put all retrieved Strings into a HashMap as a values.
 */
public class ToReadFile {

    private Map<Integer, SampleText> words = new HashMap<>();

    public void readNotes(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            int i = 1;
            while (br.ready()) {//True when there is something more to read.

                String[] word = br.readLine().split("\\s+");

                for (int j = 0; j < word.length; j++) {
                    String correctWord = word[j].replaceAll("[,.]", "").toLowerCase();
                    words.put(i, new SampleText(correctWord));
                    i++;
                }
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public void readNotesFromUserHome(String fileName) {
        String home = System.getProperty("user.home") + "\\Desktop";//Get system wide property.
        File file = new File(home, fileName);
        readNotes(file);
    }

    public void printWords() {
        for (Map.Entry<Integer, SampleText> entry : words.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getWord());
        }
    }

    public Map<Integer, SampleText> getWords() {
        return words;
    }
}
