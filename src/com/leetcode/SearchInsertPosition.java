package com.leetcode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;

       int ans= searchInsert(nums,target);
        System.out.println(ans);
    }
    static  int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;

        while (start <= end){

            //step 1
            //find mid element
            int mid = start + (end - start) / 2;


            //step 2
            //check target element is lesser than the present element or not
            if( target < nums[mid] ){
                end = mid -1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return  start;
    }
}
