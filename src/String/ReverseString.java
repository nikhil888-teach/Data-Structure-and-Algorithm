package String;

public class ReverseString {
    
    public static void main(String[] args) {
        String name = "Nikhil Godhani";
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }
        System.out.println("Reverse String :- " + reverse);
    }
}
