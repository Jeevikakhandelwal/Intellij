package com.assignment;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image={
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
       int[][] ans= FlipImage(image);
        System.out.println(Arrays.toString(ans));
    }
    static int[][] FlipImage(int[][] image){

        //calling empty array
        int[][] newImage = anotherArray(image);

        for (int i=0; i< image.length; i++ ){
            for (int j=0; j< image[i].length; j++){

                if(image[i][j] == 0){
                    image[i][j]=1;
                }
                else image[i][j]=0;
            }
        }
        return image;
    }

    static int[][] anotherArray(int[][] image){

       //Getting size from original array
       int size= image.length;

        //creating a new array with the size of original array
        int[][] newImage = new int[size][] ;

        return newImage;
    }
}