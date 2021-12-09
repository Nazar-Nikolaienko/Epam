import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DWordsTest {

    @Test
    void Three() {
        String[] words = "Test and test and again test".split(" ");
        DWords duplicatesWords = new DWords(words);

        assertArrayEquals("Test".split(" "), duplicatesWords.Three(true, true));
    }
}