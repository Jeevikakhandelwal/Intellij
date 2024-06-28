package com.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MajorityElement1 {

    public static void main(String[] args) {
        int[] arr = {3,2,3};
        ArrayList<Integer> ans= majorityElement(arr);
        System.out.println(ans);
    }
    static ArrayList<Integer> majorityElement(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return list;
        }
        Arrays.sort(nums);
        int count = 1;
        for (int outer = 1; outer < nums.length; outer++) {
                if (nums[outer] == nums[outer - 1]){
                   count ++;
                }else {
                    if (count > nums.length / 3) {
                        list.add(nums[outer - 1]);
                    }
                    count = 1;
                }
            if (count > nums.length / 3 ){
                 list.add(nums[nums.length - 1]);

            }
        }
        return list;
    }
}
