package leetcode;

import java.util.HashSet;

public class lc_2262 {
    public static long appealSum(String s) {
        long count = s.length();

        int l = s.length() - 1;
        System.out.println(l);
        while (l > 1) {
            for (int i = 0; i < s.length(); i++) {
                if ((i + l) <= s.length()) {
                    count += countDuplicate(s.substring(i, i + l));
                }
            }
            l--;
        }
        count += countDuplicate(s);

        return count;

    }

    public static void main(String[] args) {
        System.out.println(appealSum("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvaaaaaaayyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyfffffffffffffffffffffffffffpppppppppppppppppppppppppppppppppppppppppppnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnvvvvvvvvvvvvvvvvvvvvvvvvvvvvbbbbbbbbbbbbbbbbbbbbbbbbbbggggggggggggggggggggggggggggggggggggggrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkmmmmmmmmmmmmmmmmmmmmuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuoooooooooooooooooooooooooollllllllllllllllllllllllllllllwwwwwwwwwwwwwwwwwwwwwwwwwwxxxxxxxxxxxxxxxjjjjjzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzziiiiiiiiiiiiiooooooooooooooooooooooooooooooddddddddddddddddddddddddddddddddddddddnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnoooooooooooooooooooooooooopppppppppppppppppppppppppcccccccccccccccccccccccqqqqqqqwwwwwwwwwwwwwwwwwwwwkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkktttttttttttttttttttttttttttttttttttttttaaaaaaaaaaaaaaxxxxxxxxxxxxxxxxxxxxxxx"));
    }

    public static int countDuplicate(String s) {
        int c;
        System.out.println(s);
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set.size();
    }
}





