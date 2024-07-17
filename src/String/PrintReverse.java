package String;

public class PrintReverse {
    public static void main(String[] args) {
        String name = "Nikhil Godhani";
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
        System.out.println("---------- second method ------------");
        char[] ch = name.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}
