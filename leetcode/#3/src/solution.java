import java.util.Scanner;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        int n = s.length();
        int[] charCount = new int[128]; // Assuming ASCII characters

        while (right < n) {
            char currentChar = s.charAt(right);
            charCount[currentChar]++;

            while (charCount[currentChar] > 1) {
                charCount[s.charAt(left)]--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String m;
        System.out.println("Enter your word:");
        Scanner scan = new Scanner(System.in);
        m = scan.next();
        int length = lengthOfLongestSubstring(m);
        System.out.println(length);


    }
}
