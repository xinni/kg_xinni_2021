import java.util.HashMap;
import java.lang.String;

public class main {
    public static void main(String[] args) {
        if (args.length == 0 || args.length == 1) {
            System.out.println("Proper Usage is: java main str1 str2");
            System.exit(0);
        }

        String s1 = args[0];
        String s2 = args[1];

        System.out.println(exist(s1, s2));
    }

    private static boolean exist(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();
        char[] sa1 = s1.toCharArray();
        char[] sa2 = s2.toCharArray();

        for (int i = 0; i < sa1.length; i++) {
            if(!map.containsKey(sa1[i])) {
                map.put(sa1[i], sa2[i]);
            } else if (map.get(sa1[i]) != sa2[i]) {
                return false;
            }
        }

        return true;
    }
}