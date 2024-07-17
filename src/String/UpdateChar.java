package String;

import java.util.Arrays;
import java.util.Scanner;

public class UpdateChar {
    public static void main(String[] args) {
        String name = "Nikhil";
        name = name.toLowerCase();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character that you want to Update :- ");
        char old = sc.next().charAt(0);
        System.out.println("Enter New Character :- ");
        char newCh = sc.next().charAt(0);
        char[] arr = name.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == old) {
                arr[i] = newCh;
            }
        }
        System.out.println(name);
        name = new String(arr);
        System.out.println("Updated Name :- " + name);
    }
}
