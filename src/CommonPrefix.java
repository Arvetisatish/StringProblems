import java.util.Arrays;

public class CommonPrefix {
    public static String longpre(String[] arr) {
        Arrays.sort(arr);
        String s1 = arr[0];
        String s2 = arr[arr.length - 1];
        int index = 0;
        while (index < s1.length() && index < s2.length()) {
            if (s1.charAt(index) == s2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return index == 0 ? "" : s1.substring(0, index);
    }

    public static void main(String[] args) {
        String[] s = {"flower", "flow", "flight"};
        String result = longpre(s);
        System.out.println("Longest common prefix: " + result);
    }
}
