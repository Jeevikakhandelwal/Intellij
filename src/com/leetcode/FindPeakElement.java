package com.leetcode;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {0,1,0};

        int ans=findPeakElement(arr);
        System.out.println(ans);
    }
    public static int findPeakElement(int[] nums) {
        int start= 0;
        int end = nums.length-1;

        while (start < end) {
            //find mid element
            int mid = start + (end - start) / 2;

            if (nums[mid] < nums[mid + 1]) {
                //then we know that we are in ascending order
                //so, we can make the start element as mid + 1 element
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        //here, start and end element are pointing to the same element
        //so, we can return either start or end
        return start;
    }
}
