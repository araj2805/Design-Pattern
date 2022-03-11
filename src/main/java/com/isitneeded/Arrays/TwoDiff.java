package com.isitneeded.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoDiff {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<Integer>(Arrays.asList(new Integer[] {10,20})), 10));
    }
    public static int solve(ArrayList<Integer> nums, int diff) {

        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.size(); i++ ) {

            if (map.containsKey (nums.get(i) + diff))
                return 1;

            map.put ( nums.get(i) + diff, 1);


        }

        return 0;
    }
}
