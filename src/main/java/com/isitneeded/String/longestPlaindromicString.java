package com.isitneeded.String;

public class longestPlaindromicString {

    public static void main(String[] args) {

        System.out.println(longestPalindrome("aaaabaaa"));
        System.out.println(longestPalindrome("abb"));

    }


    public static String longestPalindrome (String str) {

        int start = 0, end  = 0, maxLen = end - start + 1;


        for (int i = 0; i < str.length(); i++) {

            int oddLen = palindrome (str, i, i);

            int evenLen = palindrome (str, i - 1, i);

            int len = Math.max (evenLen, oddLen);

            if (len > end - start + 1) {

                maxLen = len;

                start = i - (maxLen /2);
                end = i + ((maxLen  - 1) / 2);
            }
        }

        return str.substring(start, end + 1);
    }

    private static int palindrome(String str, int i, int j) {

        int n = str.length();

        while (i >= 0 && j < n && str.charAt(i) == str.charAt(j)) {
            i--;
            j++;
        }


        return j - i - 1;
    }


}
