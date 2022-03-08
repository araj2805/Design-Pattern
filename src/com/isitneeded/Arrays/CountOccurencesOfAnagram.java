package com.isitneeded.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccurencesOfAnagram {

    public static void main(String[] args) {

        System.out.println(findAnagrams("cbaebabacd","abc"));

    }

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new ArrayList<>();

        int k = p.length();

        Map<Character,Integer> map = new HashMap<>();

        for (char c : p.toCharArray())
            map.put (c,map.getOrDefault(c,0) + 1);

        int count = map.size();

        int i = 0, j = 0;

        int countAnagramOccurenece = 0;

        while (j < s.length()) {

            if (map.containsKey(s.charAt(j)) == true) {
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);

                if (map.get(s.charAt(j)) == 0)
                    count--;
            }


            if (j - i + 1 < k)
                j++;
            else if (j - i + 1 == k) {
                if (count == 0) {
                    res.add(i);
                    countAnagramOccurenece++;
                }

                if (map.containsKey(s.charAt(i)) == true) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);

                    if (map.get(s.charAt(i)) > 0)
                        count++;
                }

                i++;
                j++;
            }
        }

        System.out.println(countAnagramOccurenece);

        return res;
    }
}
