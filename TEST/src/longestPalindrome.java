/*
Given a string s, return the longest
palindromic

substring
 in s.
 */
import java.util.HashSet;


public class longestPalindrome {
    public static String longestPalindrome(String s) {
        HashSet<String> set = new HashSet<>();
        String s1="",s2="";
        int max = 0;
        boolean b = true;
        for (int i = 0; i < s.length(); i++) {
            s1 = "";
            for (int j=i;j < s.length(); j++) {

                s1 =s1 +s.charAt(j);
                int n = s1.length()-1;
                for (int m = 0; m < s1.length(); m++) {
                    set.add(s1);
                    if (set.size() == 1) {
                        break;

                    }else if (s1.charAt(m)!= s1.charAt(n)) {


                        b=false;
                        break;
                    }
                    n--;
                }

                if (b && s1.length()>max) {
                    max = s1.length();
                    s2 = s1;

                }
                b = true;

            }



        }
        return s2;



    }
}
