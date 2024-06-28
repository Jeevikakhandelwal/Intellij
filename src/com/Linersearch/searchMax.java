package com.Linersearch;

public class searchMax {
    public static void main(String[] args) {
        int[] arr={12,-6,89,30,46,50,26};
        int ans=maxElement(arr);
        int ans1=maxElement(arr);
        int min = minElement(arr);
        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(min);
    }
    static int maxElement(int[] arr){
        //checks size of the array
        //if array contains zero elements then this code will execute
        if(arr.length==0){
            return -1;
        }
        int max=arr[0];
        //iterate to every element of an array
        //and return max element
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }

    //boolean type
    static boolean maxElement1(int[] arr){
        //checks size of the array
        //if array contains zero elements then this code will execute
        if(arr.length==0){
            return false;
        }
        int max=arr[0];
        //iterate to every element of an array
        //and return max element
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return true;
    }

    static int minElement(int[] arr){
        //checks size of the array
        //if array contains zero elements then this code will execute
        if(arr.length==0){
            return -1;
        }
        int min=arr[0];
        //iterate to every element of an array
        //and return max element
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        return min;
    }
}
