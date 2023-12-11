package Strings.Exercise1;

public class Correct {

    static void correctWords(String words) {
        String[] wordArray = words.split(", ");
        String[] newWordArray = new String[wordArray.length];
        for (int i = 0; i < wordArray.length; i++) {
            switch (wordArray[i]) {
                case "brange":
                    newWordArray[i] = "orange";
                    break;
                case "onibn":
                    newWordArray[i] = "onion";
                    break;
                default:
                    newWordArray[i] = wordArray[i];
                    break;
            }
        }

        for (int i = 0; i < newWordArray.length; i++) {
            System.out.println((i + 1) + ") " + newWordArray[i]);
        }
    }
}


