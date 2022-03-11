package com.isitneeded.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        String str = "abcd";

        List<String> res  = new ArrayList<>();

        subsequence (str,res, 0, "");
        System.out.println(res);
    }

    private static void subsequence(String str, List<String> res, int index, String ans) {

        if (index == str.length()) {
            res.add(ans);
            return;
        }

        subsequence(str,res, index + 1, ans + str.substring(index));

        subsequence(str, res, index + 1, ans);
    }
}
