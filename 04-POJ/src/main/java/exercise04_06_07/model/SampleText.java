package exercise04_06_07.model;

import java.io.Serializable;

/**
 * pair programming:
 *
 * @author Rafał Sochacki s20047
 * @author Łukasz Cwikliński s19334
 * <p>
 * Class to keep words from file as an objects of Strings.
 */
public class SampleText implements Serializable {

    private String word;

    public SampleText() {
    }

    public SampleText(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }


    public void setWord(String word) {
        this.word = word;
    }

}
