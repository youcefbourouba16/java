import java.util.Scanner;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.equals(" ")) {
            return 1;


        } else if (s.equals("")){
            return 0;
        } else if (s.length() == 1){
            return 1;
        } else {

            int l = s.length(), b = 1;
            String s1 = "", s2 = "";
            for (int i = 0; i < l; i++) {
                s1 = subtra(i, s);
                s1 = removeDuplicates(s1);
                if (s1.length() >= s2.length())
                    s2 = s1;
            }

            return s2.length();
        }

    }

    public static String subtra(int i, String s) {
        int b = i + 1;
        String s1 = "";

        for (int k = i + 1; k < s.length(); k++) {
            if (s.charAt(k) != s.charAt(i)) {
                b += 1;
            } else
                break;
        }
        s1 = s.substring(i, b);

        return s;
    }

    public static String removeDuplicates(String s) {

        char[] mArray = s.toCharArray();
        for (int i = 0; i < mArray.length; i++) {
            for (int j = i + 1; j < mArray.length; j++) {
                if (mArray[i] == mArray[j]) {
                    mArray[j] = '\0';
                }
            }
        }
        return String.valueOf(mArray).replaceAll("\0", "");
    }

    public static void main(String[] args) {
        String m;
        System.out.println("Enter your word:");
        Scanner scan = new Scanner(System.in);
        m = scan.next();


        Solution solution = new Solution();
        int length = solution.lengthOfLongestSubstring(m);
        System.out.println(length);
    }
}
