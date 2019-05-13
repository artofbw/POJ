package exercise04_06_07;

import exercise04_06_07.filereader.ToReadFile;
import exercise04_06_07.model.SampleText;

import java.util.*;

/**
 * pair programming:
 *
 * @author Rafał Sochacki s20047
 * @author Łukasz Cwikliński s19334
 *
 * Class to get random amount of words and to print them as text in random order
 */
public class Exercise04_06 {

    private ToReadFile trf = new ToReadFile();
    private Random random = new Random();
    private final int low = 1;
    private final int high = 31;
    private int result = random.nextInt(high - low) + low;
    private int count = 0;
    private Map<Integer, List<String>> wordsInMap = new HashMap<>(); //Map of random words to print as a result of the Excercise04_06

    private int rowQuantity; //quantity of "rows" in final Map.


    public void getRandomWords() {

        trf.readNotesFromUserHome("Sample.txt");
        HashMap<Integer, SampleText> tmp = (HashMap<Integer, SampleText>) trf.getWords();
        List<Integer> keys = new ArrayList<>(tmp.keySet());

        List<String> randomWordsList = new ArrayList<>(); //temporary list of random words

        Integer randomKey;
        String wordFromFile;

        for (int i = 0; i < result; i++) {
            randomKey = keys.get(random.nextInt(keys.size()));
            wordFromFile = tmp.get(randomKey).getWord();
            randomWordsList.add(wordFromFile);
        }

        putRandomWordsInMap(randomWordsList);
    }

    public int getRowQuantity() {
        if ((float) result / 5 < 1.0) {
            rowQuantity = 1;
        } else if ((float) result / 5 >= 1.0 && (float) result % 5 != 0.0) {
            rowQuantity = (result / 5) + 1;
        } else {
            rowQuantity = result / 5;
        }
        return rowQuantity;
    }

    public void putRandomWordsInMap(List randomWords) {
        List<String> values; //to temporary keep words from list with all random words

        for (int i = 0; i < getRowQuantity(); i++) {
            values = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                String wordToAdd = (String) randomWords.get(count);
                if (wordToAdd != null) {
                    values.add(wordToAdd);
                    count++;
                } else {
                    values.add("");
                }

                if (count == result) { //It may be not the best way to break the loop but it gets job done ;)
                    break;
                }
            }
            wordsInMap.put(i, values);
        }

        printDifferentWords(wordsInMap);
    }

    public void printDifferentWords(Map<Integer, List<String>> wordsInMap) {
        for (Map.Entry<Integer, List<String>> entry : wordsInMap.entrySet()) {
            System.out.println(entry.getValue()
                    .toString()
                    .replace("[", "")
                    .replace("]", ""));
        }
        System.out.println("\nNumber of words: " + count);
    }

}
