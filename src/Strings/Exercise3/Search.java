package Strings.Exercise3;

import java.util.Scanner;

public class Search {

    static void searchWords(String words) {
        String[] wordArray = words.split(", ");
        int countRepeatName = 0;
        Scanner name = new Scanner(System.in);
        System.out.println("Enter a name to search ");
        String enterName = name.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= wordArray.length - 1; i++) {
            if (wordArray[i].equals(enterName)) {
                countRepeatName++;
            }
        }

        result.append("result search: \n");
        if (countRepeatName > 0) {
            result.append("Name ").append(enterName).append(" is on the list.\n");
        }
        if (countRepeatName > 0) {
            result.append("The entered name is found in the list ").append(countRepeatName).append(" times.\n");
        } else {
            result.append("The entered name is missing.\n");
        }
        System.out.println(result.toString());
    }
}

