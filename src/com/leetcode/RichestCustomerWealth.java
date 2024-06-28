package com.leetcode;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts= {
                {1,5},
                {7,3},
                {3,5}
        };
        int ans=maximumWealth(accounts);
        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for(int customer=0;customer<accounts.length;customer++){
            int count=0;
            for (int bank=0; bank<accounts[customer].length;bank++){

                //adding the account holders wealth
                count=count+accounts[customer][bank];
            }

            //finding the max value
            //check with overall accounts customer
           if(count> max){
               max=count;
           }
        }
        return max;
    }
}
