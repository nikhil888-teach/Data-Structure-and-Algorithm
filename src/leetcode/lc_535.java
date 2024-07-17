package leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        char[] encde = longUrl.toCharArray();
        String binary = "";
        for (int i = 0; i < encde.length; i++) {
            int temp = Integer.parseInt(Integer.toBinaryString(encde[i]));
            temp = temp - 1099999;
            binary = binary + temp;
            binary += " ";
        }
        return binary;

    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String[] temp = shortUrl.split(" ");
        String url = "";
        System.out.println();
        for (int i = 0; i < temp.length; i++) {
            url += Integer.parseInt(temp[i]) + 1099999 + " ";
        }
        String dec = Arrays.stream(url.split(" ")).map(binary -> Integer.parseInt(binary, 2)).map(Character::toString).collect(Collectors.joining());

        System.out.println(dec);
        return dec;
    }

}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
public class lc_535 {
    public static void main(String[] args) {
        Codec c = new Codec();
        System.out.println(c.decode(c.encode("https://leetcode.com/problems/design-tinyurl")));

    }
}
