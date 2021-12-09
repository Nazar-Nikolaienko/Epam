import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthWordsTest {

    @Test
    void UWords() {
        String[] words = "Test and test and again test".split(" ");
        LWords lengthWords = new LWords(words);

        assertArrayEquals("Test and test and again test".split(" "), lengthWords.getUniqueWords());
    }

    @Test
    void ThreeM() {
        String[] words = "Test and test and again test".split(" ");
        LWords lengthWords = new LWords(words);

        assertArrayEquals("Test and test and again test".split(" "), lengthWords.getThreeMaxLengthWords());
    }
}