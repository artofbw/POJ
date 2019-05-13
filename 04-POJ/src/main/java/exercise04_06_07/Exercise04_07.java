package exercise04_06_07;

import exercise04_06_07.filereader.ToReadFile;
import exercise04_06_07.model.SampleText;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * pair programming:
 *
 * @author Rafał Sochacki s20047
 * @author Łukasz Cwikliński s19334
 * <p>
 * Class to find a duplicates in Map and to print them out on the std output as the other Map.
 */
public class Exercise04_07 {
    private ToReadFile trf = new ToReadFile();

    public void printDuplicates() {

        trf.readNotesFromUserHome("Sample.txt");

        Map<Integer, SampleText> tmp = trf.getWords();

        Collection<String> wordsInList = new ArrayList<>();

        for (Map.Entry<Integer, SampleText> entry : tmp.entrySet()) {
            wordsInList.add(entry.getValue().getWord());
        }

        Map<String, Integer> duplicates = new HashMap<>();

        for (String str : wordsInList) {
            if (duplicates.containsKey(str)) {
                duplicates.put(str, duplicates.get(str) + 1);
            } else {
                duplicates.put(str, 1);
            }
        }

        printDuplicatesAndQuantity(duplicates);
    }

    public void printDuplicatesAndQuantity(Map<String, Integer> duplicates) {
        for (Map.Entry<String, Integer> entry : duplicates.entrySet()) {
            System.out.println("Word: - " + entry.getKey() + " -  Quantity: " + entry.getValue());
        }
    }
}
