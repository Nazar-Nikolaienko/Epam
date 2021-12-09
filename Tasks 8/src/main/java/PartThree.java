public class PartThree {

    public static void main(String[] args) {
        String[] words = ConWords.con("C:\\OOP\\Tasks 8\\src\\main\\java\\text.txt", true);
        DWords duplicatesWords = new DWords(words);

        for(String word: duplicatesWords.Three(true, true)){
            System.out.println(word);
        }
    }
}
