package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :- ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {

            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        String dup = "";
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                dup += str.charAt(i);
            }

        }

        System.out.println("Remove Duplicate :- " + dup);

    }
}
