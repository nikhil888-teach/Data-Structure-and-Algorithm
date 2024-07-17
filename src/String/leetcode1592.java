package String;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode1592 {
    public static String reorderSpaces(String text) {
        String[] countWord = text.split(" ");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < countWord.length; i++) {
            countWord[i] = countWord[i].trim();
            if (!countWord[i].isEmpty()) {
                arrayList.add(countWord[i]);
            }
        }
        int countSpace = 0;
        String out = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                countSpace++;
            }
        }
        boolean flag = false;
        if ((countSpace % arrayList.size() - 1) != 0) {
            flag = true;
        }

        countSpace = countSpace / (arrayList.size() - 1);
        for (int i = 0; i < arrayList.size(); i++) {
            out += arrayList.get(i);
            if (i != arrayList.size() - 1) {
                for (int j = 0; j < countSpace; j++) {
                    out += " ";
                }
            }
        }
        if (flag) {
            out += " ";
        }

        return out;
    }

    public static void main(String[] args) {
        System.out.println(7 % 2);
//        System.out.println(reorderSpaces(" practice   makes   perfect"));
    }
}
