package Strings.Exercise2;

public class Correct {

    static String removeWord(String words, String wordRemove) {
        String[] wordArray = words.split(", ");
        StringBuilder result = new StringBuilder();

        for (String word : wordArray) {
            if (!word.equals(wordRemove)) {
                result.append(word).append(", ");
            }
        }

        return result.toString();
    }

    static void printWords(String words) {
        String[] wordArray = words.split(", ");
        for (int i = 0; i < wordArray.length; i++) {
            System.out.println((i + 1) + ") " + wordArray[i]);
        }
    }
}
