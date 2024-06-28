package com.leetcode;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr={};
        int target=8;
        int[] ans=findPosition(arr,target);
        //System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans));
    }
    static int[] findPosition(int[] arr, int target){
        int[] ans={-1,-1};
       ans[0]=search(arr,target,true);
       ans[1]=search(arr,target,false);

        return ans;
    }

    static int search(int[] arr,int target,Boolean firstIndex){
        int ans=0;
        int start=0;
        int end=arr.length-1;
        while (start <= end){

            //step 1
            //find mid element
            int mid = start + (end - start) / 2;


            //step 2
            //check target element is equal to present element or not
            if( target < arr[mid] ){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                ans=mid;
                if(firstIndex){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
