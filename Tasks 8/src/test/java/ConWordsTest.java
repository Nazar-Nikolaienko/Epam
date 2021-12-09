import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ConWordsTest {

    @Test
    void conv() {
        String path = "C:\\OOP\\Tasks 8\\src\\test\\java\\text.txt";
        String[] words = ConWords.con(path, true);

        assertArrayEquals("Test and test and again test".split(" "), words);
    }

    @Test
    void convertFileNotFound() {
        String path = "C:\\OOP\\Tasks 8\\src\\test\\java\\text.txt";
        String[] words = ConWords.con(path, true);

        assertArrayEquals(new String[0], words);
    }
}