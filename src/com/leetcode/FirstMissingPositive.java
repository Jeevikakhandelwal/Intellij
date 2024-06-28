package com.leetcode;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        int ans =firstMissingPositive(nums);
        System.out.println(ans);
    }

    static int firstMissingPositive(int[] nums) {
        //since we can see in leetcode they have provided us range [0,n]
        //that means we can apply cyclic sort
        int i = 0;
        while (i < nums.length){
            int correctElement = nums[i] - 1;

            //check the currentElement is not equals to the present element
            //if it's not equal do following steps
            if(nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correctElement]){
                swap(nums, i, correctElement);
            }else {
                i++;
            }
        }

        //search for the missing element in the array
        for (int index = 0; index < nums.length; index++) {
            if( nums[index] != index + 1){
                return index + 1;
            }
        }
        return nums.length + 1;
    }

    static void swap(int[] nums, int first, int second ){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
