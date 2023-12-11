package Strings.Exercise2;

public class Main {
    public static void main(String[] args) {
        String originalWords = "orange, plum, tomato, onion, grape, onion";
        String updatedListWords = Correct.removeWord(originalWords, "onion");
        Correct.printWords(updatedListWords);
    }
}
