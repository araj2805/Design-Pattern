package com.isitneeded.Arrays;

import java.util.*;

public class Dequee {

    public static void main(String[] args) {
        int[] ans= maxSlidingWindow(new int[] {9,11}, 2);

        for (int an : ans) {
            System.out.print(an+" ");
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {

        int size = nums.length;

        int i = 0, j = 0;

        Deque<Integer> q = new LinkedList();

        List<Integer> res = new ArrayList<>();

        while (j < size) {

            // Calculation done for every new element coming in window
            while (q.isEmpty() == false && q.getFirst() < nums[j]) {
                q.pollFirst();
            }

            q.addLast(nums[j]);

            // Checking the if window size is achieved
            if (j - i + 1 < k)
                j++;


            // if window size is achieved

            if (j - i + 1 == k) {

                // Extract answer from the calculation
                res.add(q.getFirst());

                // Slide window -> revert the calclation done for the ith element
                if (nums[i] == q.getFirst())
                    q.pollFirst();

                i++;
                j++;

            }
        }

        int[] ans = new int[res.size()];

        for (int z = 0; z < ans.length; z++)
            ans[z] = res.get(z);

        return ans;

    }
}
