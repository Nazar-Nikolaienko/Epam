import java.util.Arrays;
import java.util.Objects;

public class LWords {
    private String[] uniqueWords = new String[0];

    public String[] getUniqueWords() {
        return uniqueWords;
    }

    public LWords(String[] words) {
        for (String word : words) {
            UWords(word);
        }
    }

    private void UWords(String word) {
        if (isUnique(word)) {
            uniqueWords = Arrays.copyOf(uniqueWords, uniqueWords.length + 1);
            uniqueWords[uniqueWords.length - 1] = word;
        }
    }

    private boolean isUnique(String word) {
        for (String unWord : uniqueWords) {
            if (Objects.equals(unWord, word)) {
                return false;
            }
        }
        return true;
    }

    public String[] getThreeMaxLengthWords() {
        String[] maxWords = new String[]{"", "", ""};

        findFirstMaxLengthWords(maxWords);
        findSecondMaxLengthWords(maxWords);
        findThirdMaxLengthWords(maxWords);

        return maxWords;
    }

    private void findThirdMaxLengthWords(String[] maxWords) {
        for (String uniqueWord : uniqueWords) {
            if (!Objects.equals(maxWords[0], uniqueWord)
                    && !Objects.equals(maxWords[1], uniqueWord)
                    && maxWords[2].length() < uniqueWord.length()) {
                maxWords[2] = uniqueWord;
            }
        }
    }

    private void findSecondMaxLengthWords(String[] maxWords) {
        for (String uniqueWord : uniqueWords) {
            if (!Objects.equals(maxWords[0], uniqueWord)
                    && maxWords[1].length() < uniqueWord.length()) {
                maxWords[1] = uniqueWord;
            }
        }
    }

    private void findFirstMaxLengthWords(String[] maxWords) {
        maxWords[0] = uniqueWords[0];
        for (String uniqueWord : uniqueWords) {
            if (maxWords[0].length() < uniqueWord.length()) {
                maxWords[0] = uniqueWord;
            }
        }
    }
}