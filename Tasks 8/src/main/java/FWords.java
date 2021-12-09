import java.util.Arrays;
import java.util.Objects;

public class FWords {
    private String[] uniqueWords = new String[0];
    private int[] frequency = new int[0];

    public String[] getUniqueWords() {
        return uniqueWords;
    }

    public int[] getFrequency() {
        return frequency;
    }

    public FWords(String[] words) {
        for (String word : words) {
            if (!Freq(word)) {
                addWord(word);
            }
        }
    }

    private boolean Freq(String word) {
        for (int i = 0; i < uniqueWords.length; i++) {
            if (Objects.equals(uniqueWords[i], word)) {
                frequency[i]++;
                return true;
            }
        }
        return false;
    }

    private void addWord(String word) {
        uniqueWords = Arrays.copyOf(uniqueWords, uniqueWords.length + 1);
        uniqueWords[uniqueWords.length - 1] = word;

        frequency = Arrays.copyOf(frequency, frequency.length + 1);
        frequency[frequency.length - 1] = 1;
    }

    public Object[][] getThreeMaxFrequencyWords() {
        String[] wordsMax = new String[]{"", "", ""};
        int[] frequencyMax = new int[]{0, 0, 0};

        FirstM(wordsMax, frequencyMax);
        SecondM(wordsMax, frequencyMax);
        ThirdM(wordsMax, frequencyMax);

        Object[][] result = new Object[3][2];
        for (int i = 0; i < 3; i++) {
            result[i][0] = wordsMax[i];
            result[i][1] = frequencyMax[i];
        }
        return result;
    }

    private void ThirdM(String[] wordsMax, int[] frequencyMax) {
        for (int i = 0; i < uniqueWords.length; i++) {
            if (!Objects.equals(uniqueWords[i], wordsMax[0])
                    && !Objects.equals(uniqueWords[i], wordsMax[1])
                    && frequencyMax[2] < frequency[i]) {
                frequencyMax[2] = frequency[i];
                wordsMax[2] = uniqueWords[i];
            }
        }
    }

    private void SecondM(String[] wordsMax, int[] frequencyMax) {
        for (int i = 0; i < uniqueWords.length; i++) {
            if (!Objects.equals(uniqueWords[i], wordsMax[0]) && frequencyMax[1] < frequency[i]) {
                frequencyMax[1] = frequency[i];
                wordsMax[1] = uniqueWords[i];
            }
        }
    }

    private void FirstM(String[] wordsMax, int[] frequencyMax) {
        wordsMax[0] = uniqueWords[0];
        frequencyMax[0] = frequency[0];
        for (int i = 0; i < uniqueWords.length; i++) {
            if (frequencyMax[0] < frequency[i]) {
                frequencyMax[0] = frequency[i];
                wordsMax[0] = uniqueWords[i];
            }
        }
    }


}
