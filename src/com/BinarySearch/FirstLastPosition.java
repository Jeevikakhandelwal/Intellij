package com.BinarySearch;

import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] arr={1,2,2,4,4,5,6,7};
        int target=2;
        int[] ans=position(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] position(int[] arr, int target){
        int[] ans = {-1,-1};

        //checks the first half of the array
        //if any target element is present it will return that element
        ans[0]=firstLastPosition(arr,target,true);

        //checks the second half of the array
        //if any target element is present it will return that element
        ans[1]=firstLastPosition(arr,target,false);

        return ans;
    }

    static int firstLastPosition(int[] arr,int target, Boolean firstPosition){
        int ans=0;
        int start=0;
        int end=arr.length-1;

        while (start <= end){
            //find the mid element
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                ans=mid;
                if(firstPosition){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }

        }
        return ans;
    }
}
