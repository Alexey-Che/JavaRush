package com.javarush.task.task40;

import java.util.Arrays;

class Solution {


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[] {2, 7, 11, 15};

        System.out.println(Arrays.toString(solution.twoSum(nums, 9)));
        }



    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]> target) continue;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;

                }
            }
        }
        return result;
    }
}
