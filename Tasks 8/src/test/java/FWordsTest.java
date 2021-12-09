import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FWordsTest {

    @Test
    void UnWords() {
        String[] line = "Test and test and again test".split(" ");
        FWords frequencyWords = new FWords(line);
        String[] unique = frequencyWords.getUniqueWords();

        assertArrayEquals("Test and test and again test".split(" "), unique);
    }

    @Test
    void Freq() {
        String[] line = "Test and test and again test".split(" ");
        FWords frequencyWords = new FWords(line);
        int[] frequency = frequencyWords.getFrequency();

        assertArrayEquals(new int[]{3, 2, 1, 2}, frequency);
    }

    @Test
    void ThreeM() {
        String[] line = "Test and test and again test".split(" ");
        FWords frequencyWords = new FWords(line);

        Object[][] objects = frequencyWords.getThreeMaxFrequencyWords();

        assertEquals("test1", (String)objects[0][0]);
        assertEquals(3, (int)objects[0][1]);

        assertEquals("test2", (String)objects[1][0]);
        assertEquals(3, (int)objects[1][1]);

        assertEquals("test3", (String)objects[2][0]);
        assertEquals(2, (int)objects[2][1]);
    }
}