package String;

public class countWord {
    public static void main(String[] args) {
        String name = "  ";
        name = name.trim();
        System.out.println("Without spilt :- ");
        int count = name.isEmpty() ? 0 : 1;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                count++;
                while (name.charAt(i) == ' ') {
                    i++;
                }
            }
        }
        System.out.println(count);
        System.out.println("With spilt :- ");
        String[] str = name.split("\\s");
        System.out.println(name.isBlank() ? 0 : str.length);
    }
}
