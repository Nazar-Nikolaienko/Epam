public class PartTwo {

    public static void main(String[] args){
        String[] words = ConWords.con("C:\\OOP\\Tasks 8\\src\\main\\java\\text.txt", true);

        LWords lengthWords = new LWords(words);

        for (String word : lengthWords.getThreeMaxLengthWords()){
            System.out.println(word + " ==> " + word.length());
        }
    }
}
