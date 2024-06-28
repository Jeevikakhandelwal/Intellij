package com.BinarySearch;

public class Flooring {
    public static void main(String[] args) {
        int[] arr={-4,-2,-1,0,5,6,10,11,12,18,19,22};
        int target=1;
        int ans= flooringBS(arr,target);
        System.out.println(ans);
    }
    static int flooringBS(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

//        if(arr.length==0){
//            return 1;
//        }

        while(start <= end){

            //step 1
            //find mid element
            int mid= start+(end-start)/2;

            //step 2
            //checks if the array is in ascending order or not
            Boolean isAscending = arr[start] < arr[end];

            //step 3
            //checks target is equals to present element
            if (arr[mid] == target){
                return mid;
            }

            //step 4
            //if array is in ascending order then if condition will work
            //or else condition will work for descending order
            if(isAscending){
                if(target < arr[mid]){
                    end= mid -1;
                }else{
                    start = mid +1;
                }
            }else {
                if(target > arr[mid]){
                    start = mid +1;
                }else{
                    end= mid -1;
                }
            }
        }
        return end;
    }
}
