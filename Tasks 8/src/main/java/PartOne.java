public class PartOne {
    public static void main(String[] args) {

        String[] words = ConWords.con("C:\\OOP\\Tasks 8\\src\\main\\java\\text.txt", true);

        FWords frequencyWords = new FWords(words);

        showInConsole(frequencyWords.getThreeMaxFrequencyWords());
    }

    public static void showInConsole(Object[][] objects) {
        for (Object[] object : objects) {
            System.out.println((String) object[0] + " ==> " + (int) object[1]);
        }
    }

}